
package proyecto2progra3;
/**
 *
 * @author Alfredo Valverde
 */
public class Pila<T>
{
    private Nodo<T> cabeza;

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }
    /**
   * <h1>Push</h1>
   * <p>
   * Inserta un nodo a la pila</p>
   *
   * @param _objeto objeto insertado en el nodo
   * 
   */
    public void Push(T _objeto) {
        Nodo<T> Aux = new Nodo(_objeto);
        Aux.setSiguiente(this.getCabeza());
        this.setCabeza(Aux);
    }
    /**
    * <h1>Pop</h1>
    * <p>
    * Regresa el primer objeto de la pila y elimina su nodo respectivo</p>
    *@return T
    */
    public T Pop() {
        if (this.IsEmpty())
        {
            return null;
        }
        T Aux = this.getCabeza().getObjeto();
        this.setCabeza(this.getCabeza().getSiguiente());
        return Aux;
    }
    /**
    * <h1>Peek</h1>
    * <p>
    * Regresa el primer objeto de la pila</p>
    *@return T
    */
    public T Peek() {
        if (this.IsEmpty()) {
            return null;
        }
        return this.getCabeza().getObjeto();
    }
        
    /**
    * <h1>IsEmpty</h1>
    * <p>
    * Determina si la pila esta vacia</p>
    *@return boolean: false si esta vacia.
    */ 
    public boolean IsEmpty() {
        return this.getCabeza() == null;
    }
    /**
    * <h1>Size</h1>
    * <p>
    * Determina el tamaño de la pila</p>
    *@return int: Tamaño de la pila.
    */ 
    public int Size() {
        Nodo Aux = this.getCabeza();
        int contador = 0;
        while (Aux != null) {
            contador++;
            Aux = Aux.getSiguiente();
        }
        return contador;
    }
}
