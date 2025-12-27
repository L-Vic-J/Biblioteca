
package cr.ac.ufidelitas.practicados.casodos;


public class ColaSolicitudes <T>{
    
    NodoSimple nodoInicial;
    NodoSimple nodoFinal;

    public ColaSolicitudes() {
        this.nodoInicial = null;
        this.nodoFinal = null;
    }
    
      
    
    public void insertar (T dato){
        
        NodoSimple nuevo= new NodoSimple(dato);
        
        if (estaVacia()){
            nodoInicial=nuevo;
            nodoFinal=nuevo;
            nodoInicial.setSiguiente(nuevo);
        }else{
            nodoFinal.setSiguiente(nuevo);
            nodoFinal=nuevo;
        }
        
    
        
    }
    

    public boolean estaVacia() {

        return nodoInicial == null;

    }
    
    
    
    public String Mostrar() {
        NodoSimple actual = nodoInicial;
        StringBuilder sb = new StringBuilder();

        while (actual != null) {
            sb.append(actual.getDato().toString()).append("-->");
            actual = actual.getSiguiente();
        }

        return sb.toString();
    }
    
    
    
}
