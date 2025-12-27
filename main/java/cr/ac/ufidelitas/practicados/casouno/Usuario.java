
package cr.ac.ufidelitas.practicados.casouno;


public class Usuario {
    
    
    //Atributos
    private String nombre, password;
    private Rol rol;
    private PilaLibros libros;
    private ColaEspera cola= new ColaEspera();

  

    
    //Constructor

    public Usuario(String nombre, String password, Rol rol,ListaLibros listaLibros,ColaEspera cola ) {
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
        this.libros= new PilaLibros(listaLibros);
        this.cola=cola;
    }

    
    // Getters
    
    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public Rol getRol() {
        return rol;
    }

    public PilaLibros getLibros() {
        return libros;
    }

    public ColaEspera getCola() {
        return cola;
    }
    
    
   
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setLibros(PilaLibros libros) {
        this.libros = libros;
    }

    
    
    public void reservarLibro (String nombre){
        
       if (libros.reservar(nombre)){
           cola.insertar(this);
       }
        
    }
    
    //To String

    @Override
    public String toString() {
        return "Usuario:" + "nombre=" + nombre + ", password=" + password + ", rol=" + rol;
    }
    
    
    
    
    
    
    
}
