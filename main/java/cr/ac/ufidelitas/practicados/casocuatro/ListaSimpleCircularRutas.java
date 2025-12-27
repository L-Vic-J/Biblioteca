
package cr.ac.ufidelitas.practicados.casocuatro;

public class ListaSimpleCircularRutas <T> {
    
    private NodoSimple nodoInicial;
    private NodoSimple nodoFinal;

    public ListaSimpleCircularRutas() {
        this.nodoInicial = null;
    }
    
      public void insertar(T dato) {
        NodoSimple nuevo= new NodoSimple (dato);
        
        if (estaVacia()){
            nodoInicial=nuevo;
            nodoFinal=nuevo;
            nodoInicial.setSiguiente(nodoFinal);
            nodoFinal.setSiguiente(nodoInicial);
        }else{
            nodoFinal.setSiguiente(nuevo);
            nodoFinal=nuevo;
            nodoFinal.setSiguiente(nodoInicial);
        }

    }

    public boolean estaVacia() {
        return nodoInicial == null;
    }
    
    
        public String Mostrar() {
        NodoSimple actual = nodoInicial;
        StringBuilder sb = new StringBuilder();

        
        do {
           sb.append(actual.getDato().toString()).append("-->");
           actual =actual.getSiguiente();
            
            
        }
        while (actual!=nodoInicial);
       
        sb.append("-->Inicio");
        return sb.toString();
    }
    

    
}
