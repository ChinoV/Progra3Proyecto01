 
package proyecto1progra3;
 
public class Persona
    {
        private String cedula;
        private double edad;
        private String nombre;
        private String apellido;
        private String segundoApellido;

        public Persona(String _cedula, double _edad, String _nombre, String _apellido, String _segundoApellido) {
            this.SetCedula(_cedula);
            this.SetEdad(_edad);
            this.SetNombre(_nombre);
            this.SetApellido(_apellido);
            this.SetSegundoApellido(_segundoApellido);
        }

        public void SetCedula(String _cedula) {
            this.cedula = _cedula;
        }

        public String GetCedula() {
            return this.cedula;
        }

        public void SetEdad(double _edad)
        {
            this.edad = _edad;
        }

        public double GetEdad()
        {
            return this.edad;
        }

        public void SetNombre(String _nombre)
        {
            this.nombre = _nombre;
        }

        public String GetNombre()
        {
            return this.nombre;
        }

        public void SetApellido(String _apellido)
        {
            this.apellido = _apellido;
        }

        public String GetApellido()
        {
            return this.apellido;
        }

        public void SetSegundoApellido(String _segundoApellido)
        {
            this.segundoApellido = _segundoApellido;
        }

        public String GetSegundoApellido()
        {
            return this.segundoApellido;
        }
    }
