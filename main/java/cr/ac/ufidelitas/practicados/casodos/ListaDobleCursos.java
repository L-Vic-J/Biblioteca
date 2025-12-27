
package cr.ac.ufidelitas.practicados.casodos;


public class ListaDobleCursos <T>{
    
    private NodoSimple nodoInicial;
    private NodoSimple nodoFinal;

    public ListaDobleCursos() {
        this.nodoInicial = null;
        this.nodoFinal = null;
    }
    
    
    public void insertar (T dato){
        
        NodoSimple nuevo= new NodoSimple(dato);
        if (estaVacia()){
            nodoInicial= nuevo;
            nodoFinal=nuevo;
            nodoInicial.setSiguiente(nodoFinal);
            nodoFinal.setSiguiente(nodoInicial);
        }else{
            nodoFinal.setSiguiente(nuevo);
            nodoFinal=nuevo;
            nodoFinal.setSiguiente(nodoInicial);
        }
        
        
    }
    
  
    public boolean estaVacia (){
        return nodoInicial==null;
    }
    
    public String Mostrar (){
        NodoSimple actual= nodoInicial;
        StringBuilder sb= new StringBuilder();
        
        while (actual.getSiguiente()!=nodoInicial){
            sb.append(actual.getDato().toString()).append("-->");
            actual=actual.getSiguiente();
        }
        
        sb.append("-->Inicio");
        return sb.toString();
    }
    
}
