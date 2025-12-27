
package cr.ac.ufidelitas.practicados.casodos;

public class NewMain {

    public static void main(String[] args) {
        
        
        // Crear cursos

        Curso curso1 = new Curso("Fundamentos de programación", Dificultad.Principiante);
        Curso curso2 = new Curso("Fundamentos de redes", Dificultad.Principiante);
        Curso curso3 = new Curso("Calidad del software", Dificultad.Medio);
        Curso curso4 = new Curso("Programacion web avanzada", Dificultad.Avanzado);
        Curso curso5 = new Curso("Base de datos no relacionales", Dificultad.Medio);

        // Enlistar cursos
        ListaDobleCursos listaCursos = new ListaDobleCursos();
        
        listaCursos.insertar(curso1);
        listaCursos.insertar(curso2);
        listaCursos.insertar(curso3);
        listaCursos.insertar(curso4);
        listaCursos.insertar(curso5);
        
       System.out.println("\n=== Cursos disponibles ===");
       System.out.println(listaCursos.Mostrar());
 
        // Crear modulos
        
        
        Modulo modulo1= new Modulo("Variables y constantes","01/02/2026","08/02/2026");
        Modulo modulo2= new Modulo("Bucles finitos y no finitos","08/02/2026","15/02/2026");
        Modulo modulo3= new Modulo("Arreglos unidimensionales","15/02/2026","22/02/2026");
        Modulo modulo4= new Modulo("Condicionales","22/02/2026","28/02/2026");
        Modulo modulo5= new Modulo("Manejo de archivos","01/03/2026","08/03/2026");
        
        curso1.getLista().insertar(modulo1);
        curso1.getLista().insertar(modulo2);
        curso1.getLista().insertar(modulo3);
        curso1.getLista().insertar(modulo4);
        curso1.getLista().insertar(modulo5);
        
       System.out.println("\n=== Modulos del curso 1 ===");
       System.out.println(curso1.getLista().Mostrar());
        
       // Crear actividades pendientes
       
       Estudiante estudiante = new Estudiante("Victor", 23);
      
       Actividad actividad1= new Actividad("Tarea Sistemas Operativos", "Sistemas operativos", 5.0,"22/11/2025");
       Actividad actividad2= new Actividad("Primer avance proyecto Documentación del Software", "Documentación del Software", 20.0,"27/11/2025");
       Actividad actividad3= new Actividad("Segundo avance proyecto Cliente-Servidor", "Programacion cliente-servidor", 30.0,"22/11/2025");
       
       estudiante.getPilaActividades().instertar(actividad1);
       estudiante.getPilaActividades().instertar(actividad2);
       estudiante.getPilaActividades().instertar(actividad3);

       System.out.println("\n=== Tareas pendientes del estudiante ===");
       System.out.println(curso1.getLista().Mostrar());
       
       
       // Crear solicitudes de ayuda
       
       Solicitud solicitud1= new Solicitud("Acceso denegado al campus", Severidad.Alto,"15/11/2025");
       Solicitud solicitud2= new Solicitud("Sitio web no responde", Severidad.Critico,"20/11/2025");
       Solicitud solicitud3= new Solicitud("No salen los links de entrega", Severidad.Medio,"20/11/2025");
       
       ColaSolicitudes cola= new ColaSolicitudes();
       
       cola.insertar(solicitud1);
       cola.insertar(solicitud2);
       cola.insertar(solicitud3);
       
       System.out.println("\n=== Solicitudes de ayuda ===");
       System.out.println(cola.Mostrar());
    }

}
