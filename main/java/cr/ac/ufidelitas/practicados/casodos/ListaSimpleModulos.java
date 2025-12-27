package cr.ac.ufidelitas.practicados.casodos;

public class ListaSimpleModulos<T> {

    private NodoSimple nodoInicial;

    public ListaSimpleModulos() {
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
