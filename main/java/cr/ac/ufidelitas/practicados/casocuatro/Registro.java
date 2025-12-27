
package cr.ac.ufidelitas.practicados.casocuatro;

public class Registro {
    
    String fecha;
    String motivo;
    String lugar;

    public Registro(String fecha, String motivo, String lugar) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Registro:" + "fecha=" + fecha + ", motivo=" + motivo + ", lugar=" + lugar;
    }
    
    
    
}
