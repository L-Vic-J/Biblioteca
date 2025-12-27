
package cr.ac.ufidelitas.practicados.casouno;

//Nodo generico
public class NodoSimple <T> {
    
    //Atributos
    private NodoSimple siguiente;
    private T dato;

    //Constructor
    public NodoSimple(T dato) {
        this.dato=dato;
        this.siguiente =null;
    }

    
    //Getters
    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public T getDato() {
        return dato;
    }
    
    
    //Setters

    public void setSiguiente(NodoSimple <T> siguiente) {
        this.siguiente = siguiente;
    }

    public void setDato(Libro libro) {
        this.dato = dato;
    }
    
    
    
    
    

  
    }
    
    
    

    

