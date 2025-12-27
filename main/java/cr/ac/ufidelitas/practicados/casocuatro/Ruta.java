
package cr.ac.ufidelitas.practicados.casocuatro;


public class Ruta {
    
    String canton;
    String provincia;

    public Ruta(String canton, String provincia) {
        this.canton = canton;
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Ruta:" + "canton=" + canton + ", provincia=" + provincia;
    }
    
    
    
}
