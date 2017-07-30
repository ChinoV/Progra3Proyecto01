
package proyecto1progra3;

public class Proyecto1Progra3 {

    public static void main(String[] args) {
            System.out.println("Problema 1");
            PrimerEjercicio();
            System.out.println("Problema 2");
            SegundoEjercicio();
            System.out.println("Problema 3");
            TercerEjercicio();
        }

        // Problema 1

        static void PrimerEjercicio() {
            Lista personas = new Lista();
            personas.Add(new Persona("3-1437-0004", 20, "a", "b", "c"));
            personas.Add(new Persona("E52461", 20, "a", "b", "c"));
            personas.Add(new Persona("3-1427-0004", 20, "a", "b", "c"));
            personas.Add(new Persona("E52261", 20, "a", "b", "c"));
            personas.Add(new Persona("2-1487-0004", 20, "a", "b", "c"));
            personas.Add(new Persona("1-1432-0004", 20, "a", "b", "c"));
            personas.Add(new Persona("1-1417-0004", 20, "a", "b", "c"));
            personas.Add(new Persona("2-1437-1004", 20, "a", "b", "c"));
            personas.Add(new Persona("1-1437-0224", 20, "a", "b", "c"));
            personas.Add(new Persona("E12461", 20, "a", "b", "c"));
            personas.Add(new Persona("E51461", 20, "a", "b", "c"));
            personas.Show();
            personas.MergeSort();
            personas.Show();
        }

        // Fin del Problema 1

        // Problema 2
        
        static void SegundoEjercicio() {
            Cola cola = new Cola();
            cola.Enqueue(new Persona("3-1437-0004", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("E52461", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("3-1427-0004", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("E52261", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("2-1437-0004", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("1-1432-0004", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("1-1417-0004", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("2-1437-1004", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("1-1437-0224", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("E12461", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("E51461", 20, "a", "b", "c"));
            cola.Show();
            HeapSort(cola);
            cola.Show();
        }
        
        static Cola HeapSort(Cola Cola) {
            Cola Izquierda = new Cola();
            Cola Derecha = new Cola();
            Persona raiz = Cola.Dequeue();
            int Count = Cola.Size();
            for (int i = 0; i < Count; i++) {
                if (CompararPersonas(Cola.Peek(),raiz))
                {
                    Izquierda.Enqueue(Cola.Dequeue());
                }
                else {
                    Derecha.Enqueue(Cola.Dequeue());
                }
            }
            if (Izquierda.Size() > 0) {
                Cola x = HeapSort(Izquierda);
                Count = x.Size();
                for (int i = 0; i < Count; i++)
                {
                    Cola.Enqueue(x.Dequeue());
                }
            }
            Cola.Enqueue(raiz);
            if (Derecha.Size() > 0)
            {
                Cola x = HeapSort(Derecha);
                Count = x.Size();
                for (int i = 0; i < Count; i++)
                {
                    Cola.Enqueue(x.Dequeue());
                }
            }
            return Cola;
        }
        
        
        // Fin del problema 2
        
        // Problema 3
        static void TercerEjercicio() {
            Cola cola = new Cola();
            cola.Enqueue(new Persona("3-1437-0004", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("E52461", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("3-1427-0004", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("E52261", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("2-1437-0004", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("1-1432-0004", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("1-1417-0004", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("2-1437-1004", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("1-1437-0224", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("E12461", 20, "a", "b", "c"));
            cola.Enqueue(new Persona("E51461", 20, "a", "b", "c"));
            cola.Show();
            InsertionSort(cola);
            cola.Show();
        }

        static void InsertionSort(Cola _cola) {
            if (!_cola.IsEmpty()) {
                Cola Extranjeros = new Cola();
                Cola Nacionales = new Cola();
                while (!_cola.IsEmpty()) {
                    boolean insertando = true;
                    if (_cola.Peek().GetCedula().charAt(0) == 'E')
                    {
                        int tamanno = Extranjeros.Size();
                        for (int i = 0; i < tamanno; i++)
                        {
                            if (insertando)
                            {
                                if (Integer.parseInt(_cola.Peek().GetCedula().substring(1, _cola.Peek().GetCedula().length()-1)) < Integer.parseInt(Extranjeros.Peek().GetCedula().substring(1, Extranjeros.Peek().GetCedula().length()-1)))
                                {
                                    Extranjeros.Enqueue(_cola.Dequeue());
                                    insertando = false;
                                }
                            }
                            Extranjeros.Enqueue(Extranjeros.Dequeue());
                        }
                        if (insertando)
                        {
                            Extranjeros.Enqueue(_cola.Dequeue());
                        }
                    }
                    else {
                        int tamanno = Nacionales.Size();
                        for (int i = 0; i < tamanno; i++)
                        {
                            if (insertando)
                            {
                                if (Integer.parseInt(_cola.Peek().GetCedula().split("-")[0]) < Integer.parseInt(Nacionales.Peek().GetCedula().split("-")[0]))
                                {
                                    Nacionales.Enqueue(_cola.Dequeue());
                                    insertando = false;
                                }
                                else if (Integer.parseInt(_cola.Peek().GetCedula().split("-")[0]) == Integer.parseInt(Nacionales.Peek().GetCedula().split("-")[0]))
                                {
                                    if (Integer.parseInt(_cola.Peek().GetCedula().split("-")[1]) < Integer.parseInt(Nacionales.Peek().GetCedula().split("-")[1]))
                                    {
                                        Nacionales.Enqueue(_cola.Dequeue());
                                        insertando = false;
                                    }
                                    else if (Integer.parseInt(_cola.Peek().GetCedula().split("-")[1]) == Integer.parseInt(Nacionales.Peek().GetCedula().split("-")[1]))
                                    {
                                        if (Integer.parseInt(_cola.Peek().GetCedula().split("-")[2]) < Integer.parseInt(Nacionales.Peek().GetCedula().split("-")[2]))
                                        {
                                            Nacionales.Enqueue(_cola.Dequeue());
                                            insertando = false;
                                        }
                                    }
                                }
                            }
                            Nacionales.Enqueue(Nacionales.Dequeue());
                        }
                        if (insertando)
                        {
                            Nacionales.Enqueue(_cola.Dequeue());
                        }
                    }
                }
                while (!Extranjeros.IsEmpty()) {
                    _cola.Enqueue(Extranjeros.Dequeue());
                }
                while (!Nacionales.IsEmpty())
                {
                    _cola.Enqueue(Nacionales.Dequeue());
                }
            }
        }

        // Fin Problema 3 
        
        
        
        static boolean CompararPersonas(Persona p1, Persona p2) {
            if (p1.GetCedula().charAt(0) == 'E' || p2.GetCedula().charAt(0) == 'E')
            {
                if (p1.GetCedula().charAt(0) == 'E' && p2.GetCedula().charAt(0) == 'E')
                {
                    
                    if (Integer.parseInt(p1.GetCedula().substring(1, p1.GetCedula().length() - 1)) < Integer.parseInt(p2.GetCedula().substring(1, p2.GetCedula().length() - 1)))
                    {
                        return true;
                    }
                }
                else if (p1.GetCedula().charAt(0) == 'E')
                {
                    return true;
                }
            }
            else
            {
                if (Integer.parseInt(p1.GetCedula().split("-")[0]) < Integer.parseInt(p2.GetCedula().split("-")[0]))
                {
                    return true;
                }
                else if (Integer.parseInt(p1.GetCedula().split("-")[0]) == Integer.parseInt(p2.GetCedula().split("-")[0]))
                {
                    if (Integer.parseInt(p1.GetCedula().split("-")[1]) < Integer.parseInt(p2.GetCedula().split("-")[1]))
                    {
                        return true;
                    }
                    else if (Integer.parseInt(p1.GetCedula().split("-")[1]) == Integer.parseInt(p2.GetCedula().split("-")[1]))
                    {
                        if (Integer.parseInt(p1.GetCedula().split("-")[2]) < Integer.parseInt(p2.GetCedula().split("-")[2]))
                        {
                            return true;
                        }
                    }
                }
                
            }
            return false;
        }
}
