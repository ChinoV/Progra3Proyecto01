 
package proyecto2progra3;
 /**
 *
 * @author Alfredo Valverde
 */
public class ListaCircular<T>
{
    private NodoD<T> cabeza;

    public NodoD<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoD<T> cabeza) {
        this.cabeza = cabeza;
    }
/**
     * <h1>InsertarInicio</h1>
     * <p>
     * Inserta nodo al Inicio de la lista</p>
     * @param objeto objeto a insertar en el nodo
     */
    private void InsertarInicio(T objeto)
    {
        NodoD Temp = new NodoD(objeto);
        if (this.getCabeza() == null)
        {
            Temp.setSiguiente(Temp);
            Temp.setAnterior(Temp);
        }
        else
        {
            Temp.setSiguiente(this.getCabeza());
            Temp.setAnterior(this.getCabeza().getAnterior());
            Temp.getAnterior().setSiguiente(Temp);
            Temp.getSiguiente().setAnterior(Temp);
        }
        this.setCabeza(Temp);
    }
/**
     * <h1>InsertarFinal</h1>
     * <p>
     * Inserta nodo al final de la lista</p>
     * @param objeto objeto a insertar en el nodo
     */
    private void InsertarFinal(T objeto)
    {
        NodoD Temp = new NodoD(objeto);
        if (this.getCabeza() == null)
        {
            Temp.setSiguiente(Temp);
            Temp.setAnterior(Temp);
            this.setCabeza(Temp);
        }
        else
        {
            Temp.setSiguiente(this.getCabeza());
            Temp.setAnterior(this.getCabeza().getAnterior());
            Temp.getAnterior().setSiguiente(Temp);
            Temp.getSiguiente().setAnterior(Temp);
        }
    }

}
