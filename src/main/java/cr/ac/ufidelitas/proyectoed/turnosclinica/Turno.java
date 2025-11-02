
package cr.ac.ufidelitas.proyectoed.turnosclinica;


public class Turno {
    
    
    private static int idIncremental=1;
    private int id;
    private String nombre;

    public Turno(String nombre) {
        this.id = idIncremental;
        this.nombre = nombre;
        idIncremental++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Información del turno: "+"id= "+id +",nombre= " +nombre;
    }
    
    
    
    
    
}
