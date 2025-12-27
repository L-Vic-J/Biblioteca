
package cr.ac.ufidelitas.practicados.casotres;


public class NodoDoble <T> {
    NodoDoble <T> anterior;
    NodoDoble <T> siguiente;
    T dato;

    public NodoDoble(T dato) {
        this.anterior = null;
        this.siguiente = null;
        this.dato = dato;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
    
    
    
}
