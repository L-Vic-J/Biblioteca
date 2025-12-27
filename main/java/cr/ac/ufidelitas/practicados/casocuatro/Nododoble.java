
package cr.ac.ufidelitas.practicados.casocuatro;


public class Nododoble <T> {
     
    Nododoble <T> anterior;
    Nododoble <T> siguiente;
    T dato;

    public Nododoble(T dato) {
        this.anterior = null;
        this.siguiente = null;
        this.dato = dato;
    }

    public Nododoble<T> getAnterior() {
        return anterior;
    }

    public Nododoble<T> getSiguiente() {
        return siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setAnterior(Nododoble<T> anterior) {
        this.anterior = anterior;
    }

    public void setSiguiente(Nododoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }



    
    
    
}
