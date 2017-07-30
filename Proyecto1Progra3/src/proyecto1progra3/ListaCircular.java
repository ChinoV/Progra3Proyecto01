 
package proyecto1progra3;
 
public class ListaCircular
    {
        private NodoD cabeza;

        private void SetCabeza(NodoD _cabeza)
        {
            this.cabeza = _cabeza;
        }
        private NodoD GetCabeza()
        {
            return this.cabeza;
        }


        private void InsertarInicio(Persona persona)
        {
            NodoD Temp = new NodoD(persona);
            if (this.GetCabeza() == null)
            {
                Temp.SetSiguiente(Temp);
                Temp.SetAnterior(Temp);
            }
            else
            {
                Temp.SetSiguiente(this.GetCabeza());
                Temp.SetAnterior(this.GetCabeza().GetAnterior());
                Temp.GetAnterior().SetSiguiente(Temp);
                Temp.GetSiguiente().SetAnterior(Temp);
            }
            this.SetCabeza(Temp);
        }

        private void InsertarFinal(Persona persona)
        {
            NodoD Temp = new NodoD(persona);
            if (this.GetCabeza() == null)
            {
                Temp.SetSiguiente(Temp);
                Temp.SetAnterior(Temp);
                this.SetCabeza(Temp);
            }
            else
            {
                Temp.SetSiguiente(this.GetCabeza());
                Temp.SetAnterior(this.GetCabeza().GetAnterior());
                Temp.GetAnterior().SetSiguiente(Temp);
                Temp.GetSiguiente().SetAnterior(Temp);
            }
        }
        
    }
