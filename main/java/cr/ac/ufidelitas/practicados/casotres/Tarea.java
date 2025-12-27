
package cr.ac.ufidelitas.practicados.casotres;


public class Tarea  {
    private int id=0;
    private static int contador=1;
    private String nombre;
    private String fechaDeEntrega;
    private Prioridad prioridad;

    public Tarea(String nombre, String fechaDeEntrega, Prioridad prioridad) {
        this.id=contador++;
        this.nombre = nombre;
        this.fechaDeEntrega = fechaDeEntrega;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeEntrega(String fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", fechaDeEntrega=" + fechaDeEntrega + ", prioridad=" + prioridad ;
    }



 
    
}
