 
package proyecto1progra3;
 
public class NodoD
    {
        private Persona persona;
        private NodoD siguiente;
        private NodoD anterior;

        public NodoD(Persona persona)
        {
            this.SetObjeto(persona);
        }

        public void SetObjeto(Persona persona)
        {
            this.persona = persona;
        }

        public Persona GetObjeto()
        {
            return this.persona;
        }

        public void SetSiguiente(NodoD _siguiente)
        {
            this.siguiente = _siguiente;
        }

        public NodoD GetSiguiente()
        {
            return this.siguiente;
        }

        public void SetAnterior(NodoD _anterior)
        {
            this.anterior = _anterior;
        }

        public NodoD GetAnterior()
        {
            return this.anterior;
        }

    }
