
package cr.ac.ufidelitas.practicados.casocuatro;


public class NodoSimple <T>{
    
    NodoSimple <T> siguiente;
    T dato;

    public NodoSimple( T dato) {
        this.siguiente = null;
        this.dato = dato;
    }

    public NodoSimple<T> getSiguiente() {
        return siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setSiguiente(NodoSimple<T> siguiente) {
        this.siguiente = siguiente;
    }


    public void setDato(T dato) {
        this.dato = dato;
    }
    
}
