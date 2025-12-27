
package cr.ac.ufidelitas.practicados.casouno;


public class ListaCircularDobleUsuarios {
    
    
    NodoDoble nodoInicial;
    NodoDoble nodoFinal;

    public ListaCircularDobleUsuarios() {
        this.nodoInicial = null;
        this.nodoFinal = null;
    }
    
    public void Insertar (Usuario usuario){
        
        NodoDoble nuevo= new NodoDoble(usuario);
        if (estaVacia()){
            nodoInicial= nuevo;
            nodoFinal=nuevo;
            
            nodoInicial.setSiguiente(nodoFinal);
            nodoInicial.setAnterior(nodoFinal);
            nodoFinal.setSiguiente(nodoInicial);
            nodoFinal.setAnterior(nodoInicial);
            
        }else{
            
            nodoFinal.setSiguiente(nuevo);
            nuevo.setAnterior(nodoFinal);
            nodoFinal=nuevo;
            nodoFinal.setSiguiente(nodoInicial);
            nodoInicial.setAnterior(nodoFinal);
        }
        
        
        
    }
    
   
    public boolean estaVacia (){
        
        return nodoInicial==null;
        
    }
    
    public String mostrar (){
        NodoDoble actual= nodoInicial;
        StringBuilder sb= new StringBuilder();
        
        while (actual.getSiguiente()!=nodoInicial){
             sb.append(actual.getUsuario().toString()).append("-->");
             actual= actual.getSiguiente();
        }
        
        sb.append("-->Inicio");
        
        return sb.toString();
    
 }   
}
