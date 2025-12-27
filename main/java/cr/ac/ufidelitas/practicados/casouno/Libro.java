
package cr.ac.ufidelitas.practicados.casouno;


public class Libro {
    
    //Atributos
    private String titulo,autor,genero,fechaPublicacion;

    public Libro(String titulo, String autor, String genero, String fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
    }

    
    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    
    //Setters
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Libro:" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", fechaPublicacion=" + fechaPublicacion;
    }
    
    
    
    
    
    
    
}
