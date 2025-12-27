package cr.ac.ufidelitas.practicados.casotres;

public class PilaHistorial<T> {

    NodoSimple cima;

    public PilaHistorial() {
        this.cima = cima;
    }

    public void insertar(T dato) {
        NodoSimple nuevo = new NodoSimple(dato);

        if (estaVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
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
