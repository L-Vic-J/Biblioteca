
package cr.ac.ufidelitas.practicados.casouno;


public class PracticaDos {

    public static void main(String[] args) {
        
    ListaLibros lista= new ListaLibros();
    ListaCircularDobleUsuarios usuarios = new ListaCircularDobleUsuarios();
    ColaEspera colaEspera= new ColaEspera();
        
        
        // Ingresar libros
        
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico", "1967");
        Libro libro2 = new Libro("1984", "George Orwell", "Distopía", "1949");
        Libro libro3 = new Libro("El señor de los anillos", "J. R. R. Tolkien", "Fantasía épica", "1954");
        Libro libro4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela clásica", "1605");
        Libro libro5 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", "Misterio", "2001");
        
        lista.insertar(libro1);
        lista.insertar(libro2);
        lista.insertar(libro3);
        lista.insertar(libro4);
        lista.insertar(libro5);
        
        System.out.println("\n=== Libros disponibles ===");
        System.out.println(lista.mostrar());
        
        
        // Ingresar usuarios
        
        Usuario usuario1= new Usuario("Victor","123", Rol.Estudiante,lista,colaEspera);
        Usuario usuario2= new Usuario("Andrea","hola", Rol.Profesor,lista,colaEspera);
        Usuario usuario3= new Usuario("Pablo","adios", Rol.Estudiante,lista,colaEspera);
        Usuario usuario4= new Usuario("Jimena","gato", Rol.Profesor,lista,colaEspera);
        Usuario usuario5= new Usuario("Susana","perro", Rol.Estudiante,lista,colaEspera);
        
        
        usuarios.Insertar(usuario1);
        usuarios.Insertar(usuario2);
        usuarios.Insertar(usuario3);
        usuarios.Insertar(usuario4);
        usuarios.Insertar(usuario5);
        
        System.out.println("\n=== Usuario registrados ===");
        System.out.println(usuarios.mostrar());
        
        
        // Reservar un libro exitosamente
        
        usuario2.reservarLibro("Cien años de soledad");
        
        System.out.println("\n=== Pila Libros de Usuario 2 ===");
        
        System.out.println(usuario2.getLibros().mostrarPila());
        
        usuario2.reservarLibro("Don Quijote de la Mancha");
        
        System.out.println("\n=== Pila Libros de Usuario 2 ===");
        
        System.out.println(usuario2.getLibros().mostrarPila());
        
        // Reservar un libro no existente
        
        usuario3.reservarLibro("Harry Potter");
        usuario4.reservarLibro("La historia de Costa Rica");
        
        System.out.println("\n=== Cola de usuarios en espera ===");
        
        System.out.println(usuario4.getCola().mostrar());
        
    }
}
