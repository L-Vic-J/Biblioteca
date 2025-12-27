
package cr.ac.ufidelitas.practicados.casouno;


public class NodoDoble {
    
    //Atributos
    private Usuario usuario;
    private NodoDoble anterior, siguiente;

    //Constructor
    public NodoDoble(Usuario usuario) {
        this.usuario = usuario;
        this.anterior = null;
        this.siguiente = null;
    }

    
    // Getters
    
    public Usuario getUsuario() {
        return usuario;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }
    
    //  Setters

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
