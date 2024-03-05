import java.util.Scanner;

public class Recepcionista {
    private Scanner scanner = new Scanner(System.in);
    LecturaDatos in = new LecturaDatos();
    Hotel hotel = new Hotel();


    public void mostrarEstadoHabitaciones(Hotel hotel) {
        String[][] habitaciones = hotel.getHabitaciones();
        for (int piso = 0; piso < habitaciones.length; piso++) {
            System.out.println("Piso " + (piso + 1) + ":");
            for (int habitacion = 0; habitacion < habitaciones[piso].length; habitacion++) {
                System.out.println("Habitación " + (habitacion + 1) + ": " + habitaciones[piso][habitacion]);
            }
            System.out.println();
        }
    }


    public void gestionarReservas(Hotel hotel) {
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("¿Desea reservar habitaciones?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    hotel.reservarHabitacion();
                    break;
                case 2:
                    System.out.println("¡Gracias por utilizar nuestros servicios!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese 1 o 2.");
                    break;
            }
        }
    }


    public void hacerChecksOut(Hotel hotel) {
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("¿Desea entregar habitaciones?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    hotel.dejarHabitacion();
                    break;
                case 2:
                    System.out.println("¡Gracias por utilizar nuestros servicios!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese 1 o 2.");
                    break;
            }
        }
    }

   
}
