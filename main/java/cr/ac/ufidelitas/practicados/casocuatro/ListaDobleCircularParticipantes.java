package cr.ac.ufidelitas.practicados.casocuatro;

public class ListaDobleCircularParticipantes<T> {

    private Nododoble nodoInicial;
    private Nododoble nodoFinal;

    public ListaDobleCircularParticipantes() {
        this.nodoInicial = null;
        this.nodoFinal = null;
    }

    public void insertar(T dato) {
        Nododoble nuevo= new Nododoble (dato);
        
        if (estaVacia()){
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
        Nododoble actual = nodoInicial;
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
