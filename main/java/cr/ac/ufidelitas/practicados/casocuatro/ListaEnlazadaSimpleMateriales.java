
package cr.ac.ufidelitas.practicados.casocuatro;


public class ListaEnlazadaSimpleMateriales <T> {
    
        private NodoSimple nodoInicial;

    public ListaEnlazadaSimpleMateriales() {
        this.nodoInicial = null;
    }

    public void insertar(T dato) {

        NodoSimple nuevo = new NodoSimple(dato);
        if (estaVacia()) {
            nodoInicial = nuevo;
        } else {
            nuevo.setSiguiente(nodoInicial);
            nodoInicial = nuevo;
        }

    }

    public boolean estaVacia() {

        return nodoInicial == null;

    }

    public String Mostrar() {
        NodoSimple actual = nodoInicial;
        StringBuilder sb = new StringBuilder();

        while (actual != null) {
            sb.append(actual.getDato().toString()).append("-->");
            actual = actual.getSiguiente();
        }

        return sb.toString();
    }
    
    
}
