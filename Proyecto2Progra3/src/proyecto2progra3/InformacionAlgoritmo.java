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
    
    private int id;
    private String nombre;
    private String tipo;
    private Date fecha;
    private long duracion;

    public InformacionAlgoritmo(int id, String nombre, String tipo, Date fecha, long duracion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getDuracion() {
        return duracion;
    }

    public void setDuracion(long duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "InformacionAlgoritmo{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", fecha=" + fecha + ", duracion=" + duracion + '}';
    }
    
}
