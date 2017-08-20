package proyecto2progra3;
/**
 *
 * @author Alfredo Valverde
 */
public class Cola<T>
{
    private Nodo<T> cabeza;

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * <h1>Enqueue</h1>
     * <p> Inserta un nodo en la Cola
     * </p> 
     * @param objeto Objeto a insertar en el nodo
     */
    public void Enqueue(T objeto) {
        if (this.IsEmpty())
        {
            this.setCabeza(new Nodo(objeto));
        }
        else {
            Nodo Aux = this.getCabeza();
            while (Aux.getSiguiente() != null)
            {
                Aux = Aux.getSiguiente();
            }
            Aux.setSiguiente(new Nodo(objeto));
        }
    }

    /**
     * <h1>Dequeue</h1>
     * <p> Saca un nodo en la Cola
     * </p> 
     * @return T 
     */
    public T Dequeue()
    {
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
    public T Peek()
    {
        if (this.IsEmpty())
        {
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
    public boolean IsEmpty()
    {
        return this.getCabeza() == null;
    }

    /**
* <h1>Size</h1>
* <p>
* Determina el tamaño de la cola</p>
*@return int: Tamaño de la cola.
*/ 
    public int Size()
    {
        Nodo<T> Aux = this.getCabeza();
        int contador = 0;
        while (Aux != null)
        {
            contador++;
            Aux = Aux.getSiguiente();
        }
        return contador;
    }

    /**
     * <h1>Show</h1>
     * <p>Despliega la cola.
     * </p>
     */
    public void Show(){
        System.out.println();
        Nodo Aux = this.getCabeza();
        while (Aux != null) {
            Persona temp = (Persona)Aux.getObjeto();
            System.out.print(temp.getCedula() + " "); 
            Aux = Aux.getSiguiente();
        } 
        System.out.println();
    }
    
    /**
     * <h1>getString</h1>
     * <p>Retorna la pila en un string
     * </p>
     * @return String
     */
    public String getString() { 
        String mensaje="";
        Nodo Aux = this.getCabeza();
        while (Aux != null) { 
            mensaje+=((Persona)Aux.getObjeto()).getCedula() + "  ";
            Aux = Aux.getSiguiente();
        } 
        return mensaje;
    }

    
}
