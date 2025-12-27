
package cr.ac.ufidelitas.practicados.casouno;

import javax.swing.JOptionPane;


public class PilaLibros {
    
    //Atributos
    private NodoSimple cima;
    private ListaLibros listaLibros;
    private ColaEspera colaEspera;
    
    public PilaLibros(ListaLibros listaLibros) {
        this.cima = null;
        this.listaLibros=listaLibros;
    }
    
    
    
    
    public void insertar (Libro libro){
 
      NodoSimple nuevo= new NodoSimple(libro);
      
      if (cima==null){
          cima= nuevo;
      }else{
          nuevo.setSiguiente(cima);
          cima= nuevo;
      }
        
    }
    
    
    public boolean reservar (String nombre){
        
        Libro libro= listaLibros.recorrer(nombre);
        
        if (libro!=null){
            insertar(libro);
            JOptionPane.showMessageDialog(null,"Libro reservado con exito");
            return false;
        }else{
            JOptionPane.showMessageDialog(null,"El libro no esta disponible, se le pondra en cola de espera");
            return true;
            
        }
        
    }
    
    
    
        public boolean estaVacia(){
        return cima==null;
    }
    
        
        
        public String mostrarPila (){
            
            NodoSimple actual= cima;
            StringBuilder sb = new StringBuilder();
            
            while (actual!=null){
                
                sb.append(actual.getDato().toString()).append("-->");
                actual= actual.getSiguiente();
            }
            
            return sb.toString();
            
            
        }
    
    
}
