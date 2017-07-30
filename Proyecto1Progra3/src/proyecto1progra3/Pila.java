
package proyecto1progra3;

public class Pila
    {
        private Nodo cabeza;

        private void SetCabeza(Nodo _cabeza) {
            this.cabeza = _cabeza;
        }

        private Nodo GetCabeza() {
            return this.cabeza;
        }

        public void Push(Persona _objeto) {
            Nodo Aux = new Nodo (_objeto);
            Aux.SetSiguiente(this.GetCabeza());
            this.SetCabeza(Aux);
        }

        public Persona Pop() {
            if (this.IsEmpty())
            {
                return null;
            }
            Persona Aux = this.GetCabeza().GetObjeto();
            this.SetCabeza(this.GetCabeza().GetSiguiente());
            return Aux;
        }

        public Persona Peek() {
            if (this.IsEmpty()) {
                return null;
            }
            return this.GetCabeza().GetObjeto();
        }

        public boolean IsEmpty() {
            return this.GetCabeza() == null;
        }

        public int Size() {
            Nodo Aux = this.GetCabeza();
            int contador = 0;
            while (Aux != null) {
                contador++;
                Aux = Aux.GetSiguiente();
            }
            return contador;
        }
    }
