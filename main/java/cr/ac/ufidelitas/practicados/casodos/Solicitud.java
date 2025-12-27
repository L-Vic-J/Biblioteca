
package cr.ac.ufidelitas.practicados.casodos;


public class Solicitud {
    
    private String nombre;
    Severidad serveridad;
    String fecha;

    public Solicitud(String nombre, Severidad serveridad, String fecha) {
        this.nombre = nombre;
        this.serveridad = serveridad;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public Severidad getServeridad() {
        return serveridad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setServeridad(Severidad serveridad) {
        this.serveridad = serveridad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Solicitud:" + "nombre=" + nombre + ", serveridad=" + serveridad + ", fecha=" + fecha;
    }
    
    
    
}
