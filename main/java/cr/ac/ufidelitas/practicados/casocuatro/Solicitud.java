
package cr.ac.ufidelitas.practicados.casocuatro;

public class Solicitud {
    
    String nombre;
    String fecha;
    String descripcion;

    public Solicitud(String nombre, String fecha,String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion=descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Solicitud:" + "nombre=" + nombre + ", fecha=" + fecha;
    }

    
}
