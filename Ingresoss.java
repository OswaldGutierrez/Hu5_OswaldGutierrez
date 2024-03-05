import java.util.Scanner;

public class Ingresoss {
    private Scanner scanner = new Scanner(System.in);

    public void procesarPago(int piso) {
        double costoHabitacion = (piso == 1) ? 375000 : 415000;
        
        System.out.println("El costo de la habitación en el piso " + piso + " es: $" + costoHabitacion);
        
        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Transferencia");
        System.out.println("2. Efectivo");
        System.out.println("3. Tarjeta");
        
        int opcionPago = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcionPago) {
            case 1:
                System.out.println("Ha seleccionado pago por transferencia.");
                // Lógica de procesamiento para pago por transferencia
                break;
            case 2:
                System.out.println("Ha seleccionado pago en efectivo.");
                // Lógica de procesamiento para pago en efectivo
                break;
            case 3:
                System.out.println("Ha seleccionado pago con tarjeta.");
                // Lógica de procesamiento para pago con tarjeta
                break;
            default:
                System.out.println("Opción de pago no válida.");
                break;
        }
    }
}


