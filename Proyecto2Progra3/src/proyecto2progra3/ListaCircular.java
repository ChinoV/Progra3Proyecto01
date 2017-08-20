 
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
    public void InsertarInicio(T objeto)
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
     * <h1>IsEmpty</h1>
     * <p>Determina si la lista esta vacia
     * </p>
     * @return boolean: false si esta vacia.
     */
    public boolean IsEmpty()
    {
        return this.getCabeza() == null;
    }
    
    /**
     * <h1>Size</h1>
     * <p>Devuelve el tamaño de la lista
     * </p>
     * @return int
     */
    public int Size()
    {
        NodoD Aux = this.getCabeza();
        int contador = 0;
        do{
            contador++;
            Aux = Aux.getSiguiente();
        }while(Aux != this.getCabeza());
        return contador;
    }
    
    /**
     * <h1>getString</h1>
     * <p>Retorna la lista en un string
     * </p>
     * @return String
     */
    public String getString() { 
        String mensaje="";
        NodoD Aux = this.getCabeza();
        do{
            mensaje+=((Persona)Aux.getObjeto()).getCedula() + "  ";
            Aux = Aux.getSiguiente();
        }while(Aux != this.getCabeza());
        return mensaje;
    }
    
/**
     * <h1>InsertarFinal</h1>
     * <p>
     * Inserta nodo al final de la lista</p>
     * @param objeto objeto a insertar en el nodo
     */
    public void InsertarFinal(T objeto)
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
    
     public void MergeSort() {
        MergeSort(this);
    }
 /**
     * <h1>MergeSort</h1>
     * <p> Ordena la lista utilizando el algoritmo MergeSort
     * </p>
     *@param lista Lista a ordenar
     */
    private void MergeSort(ListaCircular _lista)
    {
        for (int i = 1; i <= _lista.Size() / 2 + 1; i *= 2)
        {
            for (int j = i; j < _lista.Size(); j += 2 * i)
            {
                Merge(_lista, j - i, j, Math.min(j + i, _lista.Size()-1));
            }
        }
    }
/**
     * <h1>Merge</h1>
     * <p> Metodo facilitador del Algoritmo Merge
     * </p>
     *@param lista Lista a ordenar
     *@param izquierda limite izquierdo
     *@param mitad Mitad de la lista
     *@param derecha limite derecho
     * 
     */
    private void Merge(ListaCircular _lista, int izquierda, int mitad, int derecha)
    {
        int i, j, k;
        int num1 = mitad - izquierda + 1;
        int num2 = derecha - mitad;
        ListaCircular Aux = new ListaCircular();
        ListaCircular Aux2 = new ListaCircular();
        for (i = 0; i < num1; i++) {
            Aux.AgregaNodo(_lista.DesligarPorPosicion(izquierda));
            //Aux.LigarPorPosicion(_lista.DesligarPorPosicion(izquierda), i);
        }
        for (j = 0; j < num2; j++)
        {
            Aux2.AgregaNodo(_lista.DesligarPorPosicion(mitad - i + 1));
            //Aux2.LigarPorPosicion(_lista.DesligarPorPosicion(mitad - i + 1 ), j);
        }

        i = 0;
        j = 0;
        k = izquierda;
        while (i < num1 && j < num2)
        {
            if (CompararPersonas(Aux.ObtenerPersonaPorPosicion(0), Aux2.ObtenerPersonaPorPosicion(0))) {
                _lista.LigarPorPosicion(Aux.DesligarPorPosicion(0), k);
                i++;
            }
            else
            {
                _lista.LigarPorPosicion(Aux2.DesligarPorPosicion(0), k);
                j++;
            }
            k++;
        }

        while (i < num1)
        {
            _lista.LigarPorPosicion(Aux.DesligarPorPosicion(0), k);
            i++;
            k++;
        }

        while (j < num2)
        {
            _lista.LigarPorPosicion(Aux2.DesligarPorPosicion(0), k);
            j++;
            k++;
        }
    }
    
    
    private void LigarPorPosicion(NodoD nuevo, int _posicion)
    {
        NodoD Aux = this.getCabeza();
        if (_posicion == 0)
        {
            nuevo.setSiguiente(Aux);
            nuevo.setAnterior(Aux.getAnterior());
            nuevo.getAnterior().setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
            this.setCabeza(nuevo);
        }
        else {
            int i = 0;
            do{
                if (i + 1 == _posicion)
                {
                    nuevo.setSiguiente(Aux.getSiguiente());
                    Aux.setSiguiente(nuevo);
                    nuevo.setAnterior(Aux);
                    nuevo.getSiguiente().setAnterior(nuevo);
                }
                i++;
                Aux = Aux.getSiguiente();
            }while(Aux != this.getCabeza());
        }

    }

    /**
     * <h1>DesligarPorPosicion</h1>
     * <p> Desliga un nodo en una posicion dada
     * </p>
     *@param _posicion posicion en la que se ligara el nodo
     *@return Nodo 
     */
    private NodoD DesligarPorPosicion(int _posicion)
    {
        NodoD Aux = this.getCabeza();
            if (_posicion == 0)
            {
                this.setCabeza(Aux.getSiguiente());
                Aux.getAnterior().setSiguiente(Aux.getSiguiente());
                Aux.getSiguiente().setAnterior(Aux.getAnterior());
                Aux.setSiguiente(null);
                Aux.setAnterior(null);
                return Aux;
            }
            int i = 0;
            do{
                if (i+1 == _posicion)
                {
                    NodoD Aux2 = Aux.getSiguiente();
                    Aux.setSiguiente(Aux2.getSiguiente());
                    Aux2.getSiguiente().setAnterior(Aux);
                    Aux2.setSiguiente(null);
                    Aux2.setAnterior(null);
                    return Aux2;
                }
                i++;
                Aux = Aux.getSiguiente();
            }while(Aux.getSiguiente() != this.getCabeza());
        return null;
    }

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
    
    private Persona ObtenerPersonaPorPosicion(int posicion)
    {
        if (!this.IsEmpty())
        {
            int contador = 0;
            NodoD Aux = this.getCabeza();
            do{
                if (contador == posicion)
                {
                    return (Persona)Aux.getObjeto();
                }
                Aux = Aux.getSiguiente();
                contador++;
            }while(Aux != this.getCabeza());
        }
        return null;
    }
    
    
    /**
     * <h1>AgregaNodo</h1>
     * <p>
     * Agrega un nodo previamente creado a la lista</p>
     * @param Temp nodo a insertar.
     */
    private void AgregaNodo(NodoD<T> Temp) {
        Temp.setSiguiente(null);
        NodoD Aux = this.getCabeza();
        if (Aux == null) {
            Temp.setSiguiente(Temp);
            Temp.setAnterior(Temp);
            this.setCabeza(Temp);
        }
        else if (CompararPersonas((Persona)Temp.getObjeto(), (Persona)Aux.getObjeto())) {
            Temp.setSiguiente(Aux);
            Temp.setAnterior(Aux.getAnterior());
            Aux.setAnterior(Temp);
            Temp.getAnterior().setSiguiente(Temp);
            this.setCabeza(Temp);
        } else {
            do{
                if (CompararPersonas((Persona)Temp.getObjeto(), (Persona)Aux.getSiguiente().getObjeto()))
                {
                    Temp.setSiguiente(Aux.getSiguiente());
                    Aux.setSiguiente(Temp);
                    Temp.setAnterior(Aux);
                    Temp.getSiguiente().setAnterior(Temp);
                    return;
                }
                Aux = Aux.getSiguiente();
            }while(Aux != this.getCabeza());
            Temp.setSiguiente(Aux.getSiguiente());
            Temp.setAnterior(Aux);
            Aux.setSiguiente(Temp);
            Temp.getSiguiente().setAnterior(Temp);
            
        }
        }
}
