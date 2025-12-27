
package cr.ac.ufidelitas.practicados.casouno;

import javax.swing.JOptionPane;


public class ListaLibros  {
    
    private NodoSimple cabeza;

    public ListaLibros() {
        this.cabeza = null;
    }
    
    
    public void insertar (Libro libro){
        NodoSimple nuevoNodo= new NodoSimple (libro);
        
        if (estaVacia()){
            cabeza=nuevoNodo;
        }else{
            nuevoNodo.setSiguiente(cabeza);
            cabeza=nuevoNodo;
        }
    
    }
    
    public Libro recorrer (String nombre){
        
        
        if (estaVacia()){
            JOptionPane.showMessageDialog(null,"No hay libros en el catalogo");
        }else{
            NodoSimple actual= cabeza;
            
            while (actual!=null){
                Libro libro = (Libro)actual.getDato();
                if (libro.getTitulo().equals(nombre)){
                    return libro;
                }else{
                  actual=actual.getSiguiente();
            }
      
        }
        
     
        
    }
     return null; 
    
    }
    
    
    
    public boolean estaVacia(){
        return cabeza==null;
    }
    
    public String mostrar (){
        
        NodoSimple actual= cabeza;
        StringBuilder sb= new StringBuilder();
        
        while (actual!=null){
            sb.append(actual.getDato().toString()).append("-->");
            actual= actual.getSiguiente();
        }
        
        return sb.toString();
        
        
    }
    
}
