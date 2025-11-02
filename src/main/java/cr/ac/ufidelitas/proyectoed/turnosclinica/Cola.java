
package cr.ac.ufidelitas.proyectoed.turnosclinica;

import javax.swing.JOptionPane;


public class Cola {
    
    
    Nodo primero;
    Nodo ultimo;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
    }
    
    
    
  
    public void Enqueue (Turno turno){
       
    Nodo nuevoNodo= new Nodo(turno);
    
    if (ultimo!=null){
        ultimo.setSiguiente(nuevoNodo);
        ultimo=nuevoNodo;
        
    }else{
        ultimo=nuevoNodo;
    }
    
    if (primero==null){
        primero=nuevoNodo;
    }
          
    }
    
    
    
    public void Front (){
        
        if (isEmpty()){
            JOptionPane.showMessageDialog(null, "La cola esta vacia","Error al consultar la cola",JOptionPane.ERROR_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null,primero.toString(),"Información del primer turno",JOptionPane.INFORMATION_MESSAGE);  
        }
    }
    
    
    public void Dequeue (){
        
        if (isEmpty()){
            JOptionPane.showMessageDialog(null, "La cola esta vacia","Error al consultar la cola",JOptionPane.ERROR_MESSAGE);
        } else{
             
            Nodo extraido= primero;
            JOptionPane.showMessageDialog(null,extraido.toString(),"Información del turno atendido",JOptionPane.INFORMATION_MESSAGE);
            primero= primero.getSiguiente();
            
        }
        
    }
    
   
    
    public boolean isEmpty(){
        if (primero==null){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
