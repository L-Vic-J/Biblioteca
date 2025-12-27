
package cr.ac.ufidelitas.practicados.casotres;


public class Main {

   
    public static void main(String[] args) {
       

        
        
        //Crear proyectos e integrantes
        
        Proyecto proyecto1= new Proyecto("Sistema ERP");
        Proyecto proyecto2= new Proyecto("App movil de salud");
        Proyecto proyecto3= new Proyecto("Sitio web de la empresa");
        
        Integrante integrante1= new Integrante("Andres");
        Integrante integrante2= new Integrante("Melissa");
        Integrante integrante3= new Integrante("Aaron");
        
        Integrante integrante4= new Integrante("Jimena");
        Integrante integrante5= new Integrante("Luis");
        Integrante integrante6= new Integrante("Jose");
        
        Integrante integrante7= new Integrante("Samanta");
        Integrante integrante8= new Integrante("Enrique");
        Integrante integrante9= new Integrante("Luisa");
        
        proyecto1.getIntegrantes().insertar(integrante1);
        proyecto1.getIntegrantes().insertar(integrante2);
        proyecto1.getIntegrantes().insertar(integrante3);
        
        proyecto2.getIntegrantes().insertar(integrante4);
        proyecto2.getIntegrantes().insertar(integrante5);
        proyecto2.getIntegrantes().insertar(integrante6);
        
        proyecto3.getIntegrantes().insertar(integrante7);
        proyecto3.getIntegrantes().insertar(integrante8);
        proyecto3.getIntegrantes().insertar(integrante9);
        
       System.out.println("\n=== Integrantes proyecto 1 ===");
       System.out.println(proyecto1.getIntegrantes().Mostrar());
       
       System.out.println("\n=== Integrantes proyecto 2 ===");
       System.out.println(proyecto2.getIntegrantes().Mostrar());
       
       System.out.println("\n=== Integrantes proyecto 3 ===");
       System.out.println(proyecto3.getIntegrantes().Mostrar());
        
      //Crear y asignar tareas
      
      
      Tarea tarea1 =new Tarea ("Hacer diagrama de clases","11/11/2025",Prioridad.Alta);
      Tarea tarea2 =new Tarea ("Programar modulo de contabiliad","20/11/2025",Prioridad.Alta);
      Tarea tarea3 =new Tarea ("Programar modulo de facturacion","30/11/2025",Prioridad.Alta);
      
      ColaTareas tareas= new ColaTareas(proyecto1.getIntegrantes());
      tareas.insertar(tarea1);
      tareas.insertar(tarea2);
      tareas.insertar(tarea3);
        
      System.out.println("\n=== Tareas del proyecto 1 ===");
      System.out.println(tareas.Mostrar());
      tareas.Mostrar();
      
      tareas.asignarTareas();
      
      System.out.println("\n=== Tareas asignadas del proyecto 1 ===");
      System.out.println(proyecto1.getIntegrantes().Mostrar());
      
       //Modificar tarea
       
       tareas.modificarTarea(1);
      
       System.out.println("\n=== Historial de tareas modificadas del proyecto 1 ===");
        System.out.println(tareas.getPilaHistorial().Mostrar());
       
      
    }
    
    
   
    
  
    
}
