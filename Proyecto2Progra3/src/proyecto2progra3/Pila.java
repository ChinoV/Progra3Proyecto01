
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
    
    /**
    * <h1>HeapSortAlgorithm</h1>
    * <p>
    * Ordena la pila con el algoritmo HeapSort</p>
    */   
    public void HeapSortAlgorithm(){
        Pila<Persona> _pila = (Pila<Persona>) this;
        Cola<Persona> x = PilaConverter(this);
        x = HeapSort(x);
        _pila = ColaConverter(x);
        x = PilaConverter(_pila);
        while(!x.IsEmpty()){
            this.Push((T) x.Dequeue());
        }
    }
    
    /**
    * <h1>HeapSort</h1>
    * <p>
    * Facilita el ordenamiento de la pila a traves del algoritmo HeapSort</p> 
    */  
    private Cola HeapSort(Cola Cola) {
            Cola Izquierda = new Cola();
            Cola Derecha = new Cola();
            Persona raiz = (Persona)Cola.Dequeue();
            int Count = Cola.Size();
            for (int i = 0; i < Count; i++) {
                if (CompararPersonas((Persona)Cola.Peek(),raiz))
                {
                    Izquierda.Enqueue(Cola.Dequeue());
                }
                else {
                    Derecha.Enqueue(Cola.Dequeue());
                }
            }
            if (Izquierda.Size() > 0) {
                Cola x = HeapSort(Izquierda);
                Count = x.Size();
                for (int i = 0; i < Count; i++)
                {
                    Cola.Enqueue(x.Dequeue());
                }
            }
            Cola.Enqueue(raiz);
            if (Derecha.Size() > 0)
            {
                Cola x = HeapSort(Derecha);
                Count = x.Size();
                for (int i = 0; i < Count; i++)
                {
                    Cola.Enqueue(x.Dequeue());
                }
            }
            return Cola;
        }

    /**
     * <h1>CompararPersonas</h1>
     * <p> Prioritiza Personas segun su cedula
     * </p>
     *@param p1 primera persona a comparar
     *@param p2 segunda persona a comparar
     *@return boolean 
     */
    private boolean CompararPersonas(Persona p1, Persona p2) {
        if (p1.getCedula().charAt(0) == 'E' || p2.getCedula().charAt(0) == 'E')
        {
            if (p1.getCedula().charAt(0) == 'E' && p2.getCedula().charAt(0) == 'E')
            {

                if (Integer.parseInt(p1.getCedula().substring(1, p1.getCedula().length() - 1)) < Integer.parseInt(p2.getCedula().substring(1, p2.getCedula().length() - 1)))
                {
                    return true;
                }
            }
            else if (p1.getCedula().charAt(0) == 'E')
            {
                return true;
            }
        }
        else
        {
            if (Integer.parseInt(p1.getCedula().split("-")[0]) < Integer.parseInt(p2.getCedula().split("-")[0]))
            {
                return true;
            }
            else if (Integer.parseInt(p1.getCedula().split("-")[0]) == Integer.parseInt(p2.getCedula().split("-")[0]))
            {
                if (Integer.parseInt(p1.getCedula().split("-")[1]) < Integer.parseInt(p2.getCedula().split("-")[1]))
                {
                    return true;
                }
                else if (Integer.parseInt(p1.getCedula().split("-")[1]) == Integer.parseInt(p2.getCedula().split("-")[1]))
                {
                    if (Integer.parseInt(p1.getCedula().split("-")[2]) < Integer.parseInt(p2.getCedula().split("-")[2]))
                    {
                        return true;
                    }
                }
            }

        }
        return false;
    }
    
    /**
     * <h1>PilaConverter</h1> 
     * 
     *@param Pila 
     *@return Cola 
     */
    public Cola PilaConverter(Pila pPila){
        Cola x = new Cola();
        while(!pPila.IsEmpty()){
            x.Enqueue(pPila.Pop());
        }
        return x;
    }
    /**
     * <h1>ColaConverter</h1>
     *   
     *@param Cola 
     *@return Pila 
     */
    public Pila ColaConverter(Cola pCola){
        Pila x = new Pila();
        while(!pCola.IsEmpty()){
            x.Push(pCola.Dequeue());
        }
        return x;
    }
    /**
     * <h1>getString</h1>
     * <p> Convierte a un string el contenido de la pila
     * </p>
     *@return String 
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
