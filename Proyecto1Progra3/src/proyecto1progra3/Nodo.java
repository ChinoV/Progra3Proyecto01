 
package proyecto1progra3;

    public class Nodo
       {
           private Persona persona;
           private Nodo siguiente;

           public Nodo(Persona persona) {
               this.SetObjeto(persona);
           }

           public void SetObjeto(Persona persona) {
               this.persona = persona;
           }

           public Persona GetObjeto() {
               return this.persona;
           }

           public void SetSiguiente(Nodo _siguiente)
           {
               this.siguiente = _siguiente;
           }

           public Nodo GetSiguiente()
           {
               return this.siguiente;
           }
       }