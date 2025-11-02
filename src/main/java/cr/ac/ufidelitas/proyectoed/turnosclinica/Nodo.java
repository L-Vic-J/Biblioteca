
package cr.ac.ufidelitas.proyectoed.turnosclinica;


public class Nodo {
    
    
    Turno turno;
    Nodo siguiente;

    
    
    public Nodo(Turno turno) {
        this.turno = turno;
        siguiente= null;
    }

    public Turno getTurno() {
        return turno;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Turno= "+turno.toString();
    }
    
    
    

     
}
