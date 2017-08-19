/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2progra3;

import java.sql.Date;
/**
 *
 * @author Alfredo Valverde
 */
public class InformacionAlgoritmo {
    
    private String id;
    private String nombre;
    private String tipo;
    private String fecha;
    private String duracion;

    public InformacionAlgoritmo(String id, String nombre, String tipo, String fecha, String duracion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "InformacionAlgoritmo{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", fecha=" + fecha + ", duracion=" + duracion + '}';
    }
    
}
