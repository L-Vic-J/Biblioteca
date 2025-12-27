
package cr.ac.ufidelitas.practicados.casouno;


public class ColaEspera {
    
    NodoSimple inicio;
    NodoSimple ultimo;

    public ColaEspera() {
        this.inicio = null;
        this.ultimo = null;
    }
    
    public void insertar (Usuario usuario){
        
        NodoSimple nuevo = new NodoSimple(usuario);
        
        
        if (estaVacia()){
            inicio=nuevo;
            ultimo=nuevo;
            inicio.setSiguiente(ultimo);
        }else{
            ultimo.setSiguiente(nuevo);
            ultimo=nuevo;
        }
    }

    
    public boolean estaVacia (){
        return inicio==null;
    }
    
    
    public String mostrar (){
        
        NodoSimple actual= inicio;
        StringBuilder sb = new StringBuilder();
        
        while (actual!=null){
            sb.append(actual.getDato().toString()).append("-->");
            actual= actual.getSiguiente();
        }
        
       return sb.toString();
    }
    
   
    
}
