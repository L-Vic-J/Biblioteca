
package cr.ac.ufidelitas.practicados.casotres;


public class Proyecto {
    
    String nombre;
    ListaDobleCircular integrantes;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.integrantes = new ListaDobleCircular();
    }

    public String getNombre() {
        return nombre;
    }

    public ListaDobleCircular getIntegrantes() {
        return integrantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIntegrantes(ListaDobleCircular integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "Proyecto:" + "nombre=" + nombre + ", integrantes=" + integrantes.toString();
    }
    
    
    
    
}
