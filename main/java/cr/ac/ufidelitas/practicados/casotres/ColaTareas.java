
package cr.ac.ufidelitas.practicados.casotres;

import javax.swing.JOptionPane;

public class ColaTareas <T> {
    
    NodoSimple nodoInicial;
    NodoSimple nodoFinal;
    ListaDobleCircular lista;
    PilaHistorial<Tarea> pilaHistorial;

    public ColaTareas(ListaDobleCircular lista) {
        this.nodoInicial = null;
        this.nodoFinal=null;
        this.lista=lista;
        this.pilaHistorial=new PilaHistorial<Tarea>();

}

  
    
    public void insertar (T dato){
        NodoSimple actual= new NodoSimple(dato);
        
        
         if (estaVacia()){
             nodoInicial= actual;
             nodoFinal= actual;
             nodoInicial.setSiguiente(nodoFinal);
         }else{
             nodoFinal.setSiguiente(actual);
             nodoFinal=actual;
             
         }
        
        
    }
    
    public void asignarTareas (){
        NodoSimple <Tarea> actual= nodoInicial;
        NodoDoble <Integrante> actualListaIntegrantes = lista.getNodoInicial();
        
        
        do {
            
            Tarea tarea= actual.getDato();
            actualListaIntegrantes.getDato().setTarea(tarea);
            actual= actual.getSiguiente();
            actualListaIntegrantes =actualListaIntegrantes.getSiguiente();
            
        } while (actual!=null && actualListaIntegrantes!=lista.getNodoInicial());  
    }
    

    public void modificarTarea (int id){
        
        NodoSimple <Tarea> actual= nodoInicial;
        
        while (actual!=null && actual.getDato().getId()!=id){
            
            actual=actual.getSiguiente();
        } if (actual==null){
            JOptionPane.showMessageDialog(null, "No se encontro alguna tarea con esa id");
        }
        
        Tarea tareaModificar= actual.getDato();
        
        JOptionPane.showMessageDialog(null,"Tarea encontrada");
        
        int decision= Integer.parseInt(JOptionPane.showInputDialog(null,"Modificar nombre (1), fecha de entrega (2) o prioridad (3)"));     
        
        switch (decision){
            
            case 1: 
                String nombre= JOptionPane.showInputDialog("Ingrese el nombre");
                tareaModificar.setNombre(nombre);
                break;
                
            case 2:
                String fecha= JOptionPane.showInputDialog("Ingrese la fecha");
                tareaModificar.setFechaDeEntrega(fecha);
                break;
                
            case 3:
                
                 int accion= Integer.parseInt(JOptionPane.showInputDialog(null,"Critica (1), Alta (2), Media (3) o Baja (4)")); 
                 if (accion==1){
                     tareaModificar.setPrioridad(Prioridad.Critica);
                 }else if (accion==2){
                     tareaModificar.setPrioridad(Prioridad.Alta);
                 }else if (accion==3){
                     tareaModificar.setPrioridad(Prioridad.Media);
            
                 }else{
                     tareaModificar.setPrioridad(Prioridad.Baja);
                 }
                 
                 break;
        
    }
        
        
   
        String nombre=tareaModificar.getNombre();
        String fecha= tareaModificar.getNombre();
        Prioridad prioridad= tareaModificar.getPrioridad();
       
        Tarea tareaCopia= new Tarea(nombre, fecha, prioridad);
        tareaCopia.setId(tareaModificar.getId());
        pilaHistorial.insertar(tareaCopia);
    
 }
    
    
    public boolean estaVacia (){
        return nodoInicial==null;
    }
    
        public String Mostrar (){
        NodoSimple actual= nodoInicial;
        StringBuilder sb= new StringBuilder();
        
        while (actual!=null){
            sb.append(actual.getDato().toString()).append("-->");
            actual=actual.getSiguiente();
        }
       
        return sb.toString();
    }

    public NodoSimple getNodoInicial() {
        return nodoInicial;
    }

    public NodoSimple getNodoFinal() {
        return nodoFinal;
    }

    public ListaDobleCircular getLista() {
        return lista;
    }

    public PilaHistorial<Tarea> getPilaHistorial() {
        return pilaHistorial;
    }
    
    public void setNodoInicial(NodoSimple nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public void setNodoFinal(NodoSimple nodoFinal) {
        this.nodoFinal = nodoFinal;
    }

    public void setLista(ListaDobleCircular lista) {
        this.lista = lista;
    }

    public void setPilaHistorial(PilaHistorial<Tarea> pilaHistorial) {
        this.pilaHistorial = pilaHistorial;
    }


        
        
        
        
    
}
