
package Arrays;


public class array1 {
    
        public static void main(String[] args) {
        int[] calificacion = new int[2];
        String[] alumno = new String[2];
        String[] notaPalabra = new String[2];
        //EntradaNueva[] entrada = new EntradaNueva[];
        
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Agregar nombre del alumno: ");
        }
    
        for (int i = 0; i < calificacion.length; i++) {
            System.out.println("Agregar calificacion del 0 al 10: ");
        
        if (calificacion[i] <= 4.99) {
                notaPalabra[i] = "Suspenso";
            } else if ((calificacion[i] > 4.99) && (calificacion[i] <= 6.99)) {
                notaPalabra[i] = "Bien";
            } else if ((calificacion[i] > 6.99) && (calificacion[i] <= 8.99)) {
                notaPalabra[i] = "Notable";
            } else {
                notaPalabra[i] = "Sobresaliente";
            }
        }
        
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("NOMBRE: " + alumno[i]);
            System.out.println("CALIFICACION: " + calificacion[i]);
            System.out.println("NOTA: " + notaPalabra[i]);
            System.out.println("\n");
        }
        
}

    private static class EntradaNueva {

        public EntradaNueva() {
        }
    }

    
}
