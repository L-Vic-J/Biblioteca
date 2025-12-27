
package cr.ac.ufidelitas.practicados.casodos;


public class Actividad {
    
    private String nombre;
    private String materia;
    private String valor;
    private String fechaDeEntrega;

    public Actividad(String nombre, String materia, double valor, String fechaDeEntrega) {
        this.nombre = nombre;
        this.materia = materia;
        this.valor = String.valueOf(valor)+"%";
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }

    public String getValor() {
        return valor;
    }

    public String getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setFechaDeEntrega(String fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    @Override
    public String toString() {
        return "Actividad:" + "nombre=" + nombre + ", materia=" + materia + ", valor=" + valor + ", fechaDeEntrega=" + fechaDeEntrega;
    }
    
    
    
}
