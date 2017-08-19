 
package proyecto2progra3;
 /**
 *
 * @author Alfredo Valverde
 */
public class NodoD<T>
{
    private T objeto;
    private NodoD<T> siguiente;
    private NodoD<T> anterior;

    public NodoD(T objeto) {
        this.objeto = objeto;
        this.siguiente = null;
        this.anterior = null;
    }
    
    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public NodoD<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoD<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoD<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoD<T> anterior) {
        this.anterior = anterior;
    }

   
}
