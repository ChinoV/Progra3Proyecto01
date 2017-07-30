
package proyecto1progra3;

public class Cola
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

        public void Enqueue(Persona persona) {
            if (this.IsEmpty())
            {
                this.SetCabeza(new Nodo(persona));
            }
            else {
                Nodo Aux = this.GetCabeza();
                while (Aux.GetSiguiente() != null)
                {
                    Aux = Aux.GetSiguiente();
                }
                Aux.SetSiguiente(new Nodo(persona));
            }
        }

        public Persona Dequeue()
        {
            if (this.IsEmpty())
            {
                return null;
            }
            Persona Aux = this.GetCabeza().GetObjeto();
            this.SetCabeza(this.GetCabeza().GetSiguiente());
            return Aux;
        }

        public Persona Peek()
        {
            if (this.IsEmpty())
            {
                return null;
            }
            return this.GetCabeza().GetObjeto();
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
        
        public void Show(){
            System.out.println();
            Nodo Aux = this.GetCabeza();
            while (Aux != null) {
                System.out.print(Aux.GetObjeto().GetCedula() + " "); 
                Aux = Aux.GetSiguiente();
            } 
            System.out.println();
        }
    }
