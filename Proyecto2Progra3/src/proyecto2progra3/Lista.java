package proyecto2progra3;
/**
 *
 * @author Alfredo Valverde
 */
public class Lista<T>
{
    private Nodo<T> cabeza;

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

/**
     * <h1>Add</h1>
     * <p>
     * Inserta nodo al Inicio de la lista</p>
     * @param objeto objeto a insertar en el nodo
     */
    public void Add(T _objeto)
    {
        Nodo Aux = new Nodo(_objeto);
        Aux.setSiguiente(this.getCabeza());
        this.setCabeza(Aux);
    }
/**
     * <h1>AgregaNodo</h1>
     * <p>
     * Agrega un nodo previamente creado a la lista</p>
     * @param Temp nodo a insertar.
     */
    private void AgregaNodo(Nodo<T> Temp) {
        Temp.setSiguiente(null);
        Nodo Aux = this.getCabeza();
        if (Aux == null) {
            this.setCabeza(Temp);
        }
        else if (CompararPersonas((Persona)Temp.getObjeto(), (Persona)Aux.getObjeto())) {
            Temp.setSiguiente(Aux);
            this.setCabeza(Temp);
        } else {
            while (Aux.getSiguiente() != null)
            {
                if (CompararPersonas((Persona)Temp.getObjeto(), (Persona)Aux.getSiguiente().getObjeto()))
                {
                    Temp.setSiguiente(Aux.getSiguiente());
                    Aux.setSiguiente(Temp);
                    return;
                }
                Aux = Aux.getSiguiente();
            }
            Aux.setSiguiente(Temp);
        }

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
        Nodo Aux = this.getCabeza();
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
     * <p>Despliega la lista.
     * </p>
     */
    public void Show() { 
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
     * <p>Retorna la lista en un string
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
     /**
     * <h1>MergeSort</h1>
     * <p>Metodo publico que llama a metodo privado sobrecargado MergeSort 
     * </p>
     */
    public void MergeSort() {
        MergeSort(this);
    }
 /**
     * <h1>MergeSort</h1>
     * <p> Ordena la lista utilizando el algoritmo MergeSort
     * </p>
     *@param lista Lista a ordenar
     */
    private void MergeSort(Lista _lista)
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
    private void Merge(Lista _lista, int izquierda, int mitad, int derecha)
    {
        int i, j, k;
        int num1 = mitad - izquierda + 1;
        int num2 = derecha - mitad;
        Lista Aux = new Lista();
        Lista Aux2 = new Lista();
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
/**
     * <h1>ObtenerPersonaPorPosicion</h1>
     * <p> Devuelve una Persona en una posicion dada
     * </p>
     *@param posicion posicion en la lista
     *@return Persona 
     */
    private Persona ObtenerPersonaPorPosicion(int posicion)
    {
        if (!this.IsEmpty())
        {
            int contador = 0;
            Nodo Aux = this.getCabeza();
            while (Aux != null)
            {
                if (contador == posicion)
                {
                    return (Persona)Aux.getObjeto();
                }
                Aux = Aux.getSiguiente();
                contador++;
            }
        }
        return null;
    }
    
/**
     * <h1>LigarPorPosicion</h1>
     * <p> Liga un nodo en una posicion dada
     * </p>
     *@param nuevo Nodo a ligar
     *@param _posicion posicion en la que se ligara el nodo 
     */
    private void LigarPorPosicion(Nodo nuevo, int _posicion)
    {
        Nodo Aux = this.getCabeza();
        if (_posicion == 0)
        {
            nuevo.setSiguiente(Aux);
            this.setCabeza(nuevo);
        }
        else {
            int i = 0;
            while (Aux != null)
            {
                if (i + 1 == _posicion)
                {
                    nuevo.setSiguiente(Aux.getSiguiente());
                    Aux.setSiguiente(nuevo);
                }
                i++;
                Aux = Aux.getSiguiente();
            }
        }

    }

    /**
     * <h1>DesligarPorPosicion</h1>
     * <p> Desliga un nodo en una posicion dada
     * </p>
     *@param _posicion posicion en la que se ligara el nodo
     *@return Nodo 
     */
    private Nodo DesligarPorPosicion(int _posicion)
    {
        Nodo Aux = this.getCabeza();
        if (_posicion == 0)
        {
            this.setCabeza(Aux.getSiguiente());
            return Aux;
        }
        int i = 0;
        while (Aux.getSiguiente() != null)
        {
            if (i+1 == _posicion)
            {
                Nodo Aux2 = Aux.getSiguiente();
                Aux.setSiguiente(Aux2.getSiguiente());
                return Aux2;
            }
            i++;
            Aux = Aux.getSiguiente();
        }
        return null;
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
     * <h1>esCedula</h1>
     * <p> Determina si es Cedula o no.
     * </p>
     *@param p1 Documento a determinar
     *@return boolean 
     */
    public boolean esCedula(String Documento) {
        if (Documento.charAt(0) == 'E'){
            return false;
        }
        return true;
    }
    
    /**
     * <h1>OrdenarPrioridad</h1>
     * <p> Ordena la lista por pasaportes seguido de cedulas
     * </p> 
     */
    public void OrdenarPrioridad() {
        Nodo aux = cabeza;
        Lista cedulaAux = new Lista();
        Lista pasaporteAux = new Lista();

        while (aux != null) {
            if (esCedula(((Persona)aux.getObjeto()).getCedula())) {
                pasaporteAux.Add(aux.getObjeto());
            } else {
                cedulaAux.Add(aux.getObjeto());
            }
            aux = aux.getSiguiente();
        }
        this.setCabeza(null);
        while(!pasaporteAux.IsEmpty()){
            this.Add((T)pasaporteAux.getCabeza().getObjeto());
            pasaporteAux.setCabeza(pasaporteAux.getCabeza().getSiguiente());
        }
        
        while(!cedulaAux.IsEmpty()){
            this.Add((T)cedulaAux.getCabeza().getObjeto());
            cedulaAux.setCabeza(cedulaAux.getCabeza().getSiguiente());
        }
    }

/**
     * <h1>brickSort</h1>
     * <p> Ordena la lista segun el algoritmo BrickSort
     * </p> 
     * @param p Lista a ordenar
     */
     public void brickSort(Lista p) {
        if (!p.IsEmpty()) {
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < p.Size() - 1; i += 2) {
                    if(CompararPersonas(p.ObtenerPersonaPorPosicion(i), p.ObtenerPersonaPorPosicion(i+1))){
                        Nodo Aux = p.DesligarPorPosicion(i);
                        p.LigarPorPosicion(Aux, i+1);
                        sorted = false;
                    }
                }
                for (int i = 1; i < p.Size() - 1; i += 2) {
                    if(CompararPersonas(p.ObtenerPersonaPorPosicion(i), p.ObtenerPersonaPorPosicion(i+1))){
                        Nodo Aux = p.DesligarPorPosicion(i);
                        p.LigarPorPosicion(Aux, i+1);
                        sorted = false;
                    }
                }
            }
        }
        OrdenarPrioridad();
    }
    
}
