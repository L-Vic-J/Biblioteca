
package cr.ac.ufidelitas.practicados.casotres;

public class ListaEntregables <T>{

    NodoSimple nodoInicial;

    public ListaEntregables() {
        this.nodoInicial = null;
    }
    
    
    public void insertar (T dato){
        
        NodoSimple nuevo= new NodoSimple (dato);
        if (estaVacia()){
            nodoInicial=nuevo;
        }else{
            nuevo.setSiguiente(nodoInicial);
            nodoInicial=nuevo;
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

        sb.append("-->Inicio");
        return sb.toString();
    }

}
