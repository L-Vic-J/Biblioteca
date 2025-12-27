
package cr.ac.ufidelitas.practicados.casocuatro;


public class Participante {
    
    private String nombre;
    private String cedula;
    private String lugarDeResidencia;
    private PilaHistorial historial;
    

    public Participante(String nombre, String cedula, String lugarDeResidencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.lugarDeResidencia = lugarDeResidencia;
        this.historial= new PilaHistorial();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getLugarDeResidencia() {
        return lugarDeResidencia;
    }

    public PilaHistorial getHistorial() {
        return historial;
    }
    
    

    public void setHistorial(PilaHistorial historial) {
        this.historial = historial;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setLugarDeResidencia(String lugarDeResidencia) {
        this.lugarDeResidencia = lugarDeResidencia;
    }

    @Override
    public String toString() {
        return "Participante:" + "nombre=" + nombre + ", cedula=" + cedula + ", lugarDeResidencia=" + lugarDeResidencia;
    }
    
    
    
}
