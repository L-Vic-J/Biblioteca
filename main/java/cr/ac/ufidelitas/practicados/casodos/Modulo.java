
package cr.ac.ufidelitas.practicados.casodos;


public class Modulo {
    
    private String nombre;
    private String fechaInicio;
    private String fechaFinalizacion;

    public Modulo(String nombre, String fechaInicio, String fechaFinalizacion) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    @Override
    public String toString() {
        return "Modulo:" + "nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFinalizacion=" + fechaFinalizacion;
    }
    
    
    
}
