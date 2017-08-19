 
package proyecto2progra3;
/**
 *
 * @author Alfredo Valverde
 */
public class Nodo<T>
{
    private Nodo<T> siguiente;
    private T objeto;

    public Nodo(T objeto) {
        this.siguiente = null;
        this.objeto = objeto;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}