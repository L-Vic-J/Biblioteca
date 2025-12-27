package cr.ac.ufidelitas.practicados.casotres;

public class ListaDobleCircular <T> {

    private NodoDoble nodoInicial;
    private NodoDoble nodoFinal;

    public ListaDobleCircular() {
        this.nodoInicial = null;
        this.nodoFinal = null;
    }
    
    
    public void insertar (T dato){
        NodoDoble nuevo= new NodoDoble (dato);
        
        if (nodoInicial==null){
            nodoInicial=nuevo;
            nodoFinal=nuevo;
            nodoInicial.setSiguiente(nodoFinal);
            nodoFinal.setAnterior(nodoInicial);
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
        NodoDoble actual = nodoInicial;
        StringBuilder sb = new StringBuilder();

        
        do {
           sb.append(actual.getDato().toString()).append("-->");
           actual = actual.getSiguiente();
            
            
        }
        while (actual!=nodoInicial);
       
        sb.append("-->Inicio");
        return sb.toString();
    }

    public NodoDoble getNodoInicial() {
        return nodoInicial;
    }

    public NodoDoble getNodoFinal() {
        return nodoFinal;
    }

    public void setNodoInicial(NodoDoble nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public void setNodoFinal(NodoDoble nodoFinal) {
        this.nodoFinal = nodoFinal;
    }
    
    
    
    

}
