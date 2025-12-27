
package cr.ac.ufidelitas.practicados.casodos;


public class Estudiante {
    
    private String nombre;
    private int edad;
    private PilaActividades pilaActividades;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.pilaActividades = new PilaActividades();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public PilaActividades getPilaActividades() {
        return pilaActividades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPilaActividades(PilaActividades pilaActividades) {
        this.pilaActividades = pilaActividades;
    }

    @Override
    public String toString() {
        return "Estudiante:" + "nombre=" + nombre + ", edad=" + edad;
    }
    
    
    
    
}
