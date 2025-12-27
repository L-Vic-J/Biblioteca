
package cr.ac.ufidelitas.practicados.casodos;


public class Curso {
    
    private String nombre;
    private Dificultad dificultad;
    private ListaSimpleModulos lista;

    public Curso(String nombre, Dificultad dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.lista = new ListaSimpleModulos();
    }

    public String getNombre() {
        return nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public ListaSimpleModulos getLista() {
        return lista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public void setLista(ListaSimpleModulos lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Curso:" + "nombre=" + nombre + ", dificultad=" + dificultad;
    }
    
    
    
}
