 
package proyecto2progra3;
 /**
 *
 * @author Alfredo Valverde
 */
public class Persona
{
        private String cedula;
        private double edad;
        private String nombre;
        private String apellido;
        private String segundoApellido;

    public Persona(String cedula, double edad, String nombre, String apellido, String segundoApellido) {
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.segundoApellido = segundoApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

        
}
