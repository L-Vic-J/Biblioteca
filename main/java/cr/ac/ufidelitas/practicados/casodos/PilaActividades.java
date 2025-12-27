package cr.ac.ufidelitas.practicados.casodos;

public class PilaActividades<T> {

    NodoSimple cima;

    public PilaActividades() {
        this.cima = null;
    }
    
    
    public void instertar (T dato){
       
        NodoSimple nuevo= new NodoSimple(dato);
        
        if (estaVacia()){
            cima=nuevo;
        }else{
            nuevo.setSiguiente(cima);
            cima=nuevo;
        }
           
    }
    
    
    

    public boolean estaVacia() {

        return cima == null;

    }

    public String Mostrar() {
        NodoSimple actual = cima;
        StringBuilder sb = new StringBuilder();

        while (actual != null) {
            sb.append(actual.getDato().toString()).append("-->");
            actual = actual.getSiguiente();
        }

        return sb.toString();
    }


}
