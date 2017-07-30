 
package proyecto1progra3;
 
import java.util.Scanner;

public class Lista
    {
        private Nodo cabeza;

        private void SetCabeza(Nodo _cabeza)
        {
            this.cabeza = _cabeza;
        }

        private Nodo GetCabeza()
        {
            return this.cabeza;
        }

        public void Add(Persona _persona)
        {
            Nodo Aux = new Nodo(_persona);
            Aux.SetSiguiente(this.GetCabeza());
            this.SetCabeza(Aux);
        }

        private void AgregaNodo(Nodo Temp) {
            Temp.SetSiguiente(null);
            Nodo Aux = this.GetCabeza();
            if (Aux == null) {
                this.SetCabeza(Temp);
            }
            else if (CompararPersonas(Temp.GetObjeto(), Aux.GetObjeto())) {
                Temp.SetSiguiente(Aux);
                this.SetCabeza(Temp);
            } else {
                while (Aux.GetSiguiente() != null)
                {
                    if (CompararPersonas(Temp.GetObjeto(), Aux.GetSiguiente().GetObjeto()))
                    {
                        Temp.SetSiguiente(Aux.GetSiguiente());
                        Aux.SetSiguiente(Temp);
                        return;
                    }
                    Aux = Aux.GetSiguiente();
                }
                Aux.SetSiguiente(Temp);
            }
            
        }

        public boolean IsEmpty()
        {
            return this.GetCabeza() == null;
        }

        public int Size()
        {
            Nodo Aux = this.GetCabeza();
            int contador = 0;
            while (Aux != null)
            {
                contador++;
                Aux = Aux.GetSiguiente();
            }
            return contador;
        }

        public void Show() { 
            System.out.println();
            Nodo Aux = this.GetCabeza();
            while (Aux != null) {
                System.out.print(Aux.GetObjeto().GetCedula() + " "); 
                Aux = Aux.GetSiguiente();
            } 
            System.out.println();
        }

        // Problema 1
        public void MergeSort() {
            MergeSort(this);
        }

        private void MergeSort(Lista _lista)
        {
            for (int i = 1; i <= _lista.Size() / 2 + 1; i *= 2)
            {
                for (int j = i; j < _lista.Size(); j += 2 * i)
                {
                    Merge(_lista, j - i, j, Math.min(j + i, _lista.Size()-1));
                }
            }
        }
        
        private void Merge(Lista _lista, int izquierda, int mitad, int derecha)
        {
            int i, j, k;
            int num1 = mitad - izquierda + 1;
            int num2 = derecha - mitad;
            Lista Aux = new Lista();
            Lista Aux2 = new Lista();
            for (i = 0; i < num1; i++) {
                Aux.AgregaNodo(_lista.DesligarPorPosicion(izquierda));
                //Aux.LigarPorPosicion(_lista.DesligarPorPosicion(izquierda), i);
            }
            for (j = 0; j < num2; j++)
            {
                Aux2.AgregaNodo(_lista.DesligarPorPosicion(mitad - i + 1));
                //Aux2.LigarPorPosicion(_lista.DesligarPorPosicion(mitad - i + 1 ), j);
            }
                
            i = 0;
            j = 0;
            k = izquierda;
            while (i < num1 && j < num2)
            {
                if (CompararPersonas(Aux.ObtenerPersonaPorPosicion(0), Aux2.ObtenerPersonaPorPosicion(0))) {
                    _lista.LigarPorPosicion(Aux.DesligarPorPosicion(0), k);
                    i++;
                }
                else
                {
                    _lista.LigarPorPosicion(Aux2.DesligarPorPosicion(0), k);
                    j++;
                }
                k++;
            }
            
            while (i < num1)
            {
                _lista.LigarPorPosicion(Aux.DesligarPorPosicion(0), k);
                i++;
                k++;
            }
            
            while (j < num2)
            {
                _lista.LigarPorPosicion(Aux2.DesligarPorPosicion(0), k);
                j++;
                k++;
            }
        }

        private Persona ObtenerPersonaPorPosicion(int posicion)
        {
            if (!this.IsEmpty())
            {
                int contador = 0;
                Nodo Aux = this.GetCabeza();
                while (Aux != null)
                {
                    if (contador == posicion)
                    {
                        return Aux.GetObjeto();
                    }
                    Aux = Aux.GetSiguiente();
                    contador++;
                }
            }
            return null;
        }

        private void LigarPorPosicion(Nodo nuevo, int _posicion)
        {
            Nodo Aux = this.GetCabeza();
            if (_posicion == 0)
            {
                nuevo.SetSiguiente(Aux);
                this.SetCabeza(nuevo);
            }
            else {
                int i = 0;
                while (Aux != null)
                {
                    if (i + 1 == _posicion)
                    {
                        nuevo.SetSiguiente(Aux.GetSiguiente());
                        Aux.SetSiguiente(nuevo);
                    }
                    i++;
                    Aux = Aux.GetSiguiente();
                }
            }
            
        }

        private Nodo DesligarPorPosicion(int _posicion)
        {
            Nodo Aux = this.GetCabeza();
            if (_posicion == 0)
            {
                this.SetCabeza(Aux.GetSiguiente());
                return Aux;
            }
            int i = 0;
            while (Aux.GetSiguiente() != null)
            {
                if (i+1 == _posicion)
                {
                    Nodo Aux2 = Aux.GetSiguiente();
                    Aux.SetSiguiente(Aux2.GetSiguiente());
                    return Aux2;
                }
                i++;
                Aux = Aux.GetSiguiente();
            }
            return null;
        }

        private boolean CompararPersonas(Persona p1, Persona p2) {
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

        public void Prueba(Lista _lista, int Length) {
            if (Length < 2) {
                return;
            }
            int salto = 1;
            while (salto < Length) {
                int IndiceIzquierdo = 0;
                int IndiceDerecho = salto;
                while (IndiceDerecho + salto <= Length) {
                    Merge(_lista, IndiceIzquierdo, IndiceDerecho + salto, (IndiceDerecho * 2) + salto);
                    IndiceIzquierdo = IndiceDerecho + salto;
                    IndiceDerecho = IndiceIzquierdo + salto;
                }
                if (IndiceDerecho < Length) {
                    Merge(_lista, IndiceIzquierdo, IndiceIzquierdo + salto, IndiceDerecho);
                }
                salto = salto * 2;
            }
        }

    }
