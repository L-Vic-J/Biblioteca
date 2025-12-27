
package cr.ac.ufidelitas.practicados.casocuatro;


public class NewMain {

    public static void main(String[] args) {
      
        // Ingresar integrantes
        
        Participante participante1= new Participante("Andrew", "11118888","San Jose");
        Participante participante2= new Participante("Keyla", "77778888","Alajuela");
        Participante participante3= new Participante("Alvaro", "11119999","Heredia");
        
        ListaDobleCircularParticipantes listaParticipantes= new ListaDobleCircularParticipantes();
        
        listaParticipantes.insertar(participante1);
        listaParticipantes.insertar(participante2);
        listaParticipantes.insertar(participante3);
        
        System.out.println("\n=== Participantes ===");
        System.out.println(listaParticipantes.Mostrar());
       
       
        // Ingresar rutas camiones
        
        Ruta ruta1= new Ruta ("San Jose","San Jose");
        Ruta ruta2= new Ruta ("Mira Flores","Heredia");
        Ruta ruta3= new Ruta ("San Carlos","Alajuela");
        
        ListaSimpleCircularRutas listaRutas= new ListaSimpleCircularRutas();
        
        listaRutas.insertar(ruta1);
        listaRutas.insertar(ruta2);
        listaRutas.insertar(ruta3);
        
        System.out.println("\n=== Rutas ===");
        System.out.println(listaRutas.Mostrar());
       
        // Ingresar solicitudes
        
        Solicitud solicitud1= new Solicitud ("Fiorella","11/11/2025","Limpiar parque de la Merced");
        Solicitud solicitud2= new Solicitud ("Fiorella","11/11/2025","Limpiar río Virilla");
        Solicitud solicitud3= new Solicitud ("Fiorella","11/11/2025","Limpiar lote valdio");
        
        ColaSolicitudes colaSolicitudes= new ColaSolicitudes ();
        
        colaSolicitudes.insertar(solicitud1);
        colaSolicitudes.insertar(solicitud2);
        colaSolicitudes.insertar(solicitud3);
        
        System.out.println("\n=== Solicitudes ===");
        System.out.println(colaSolicitudes.Mostrar());
        
        // Historial de participante
        
        Registro registro1= new Registro ("12/11/2025","Limpieza de acera","Cartago centro");
        Registro registro2= new Registro ("12/12/2025","Limpieza de parque","Guadalupe centro");
        Registro registro3= new Registro ("12/11/2025","Campaña de reciclaje","Coronado");
        
        
        participante1.getHistorial().insertar(registro1);
        participante1.getHistorial().insertar(registro2);
        participante1.getHistorial().insertar(registro3);
        
        System.out.println("\n=== Historial ===");
        System.out.println(participante1.getHistorial().Mostrar());
        
        // Registro de materiales
        
        Material material = new Material("Botella de vidrio", "vidrio");
        Material materia2 = new Material("Cajas", "Carton o plastico");
        
        ListaEnlazadaSimpleMateriales listaMateriales= new ListaEnlazadaSimpleMateriales ();
        listaMateriales.insertar(material);
        listaMateriales.insertar(materia2);
        
         System.out.println("\n=== Listas de materiales ===");
        System.out.println(listaMateriales.Mostrar());
        
        
        
    }
    
}
