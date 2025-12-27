
package cr.ac.ufidelitas.practicados.casotres;


public class Integrante {
    
    String nombre;
    Tarea tarea;

    public Integrante(String nombre) {
        this.nombre = nombre;
        this.tarea = null;
    }

    public String getNombre() {
        return nombre;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public String toString() {
        return "Integrante:" + "nombre=" + nombre + ", tarea=" + tarea;
    }
    
    
    
    
}
