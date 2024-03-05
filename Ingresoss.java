import java.util.Scanner;

public class Ingresoss {
    private Scanner scanner = new Scanner(System.in);

    private double totalAcumulado = 0;

    public double getTotalAcumulado() {
        return totalAcumulado;
    }

    public void procesarPago(int piso) {
        double costoHabitacion = (piso == 1) ? 375000 : 415000;
        
        System.out.println("\tEl costo de la habitación en el piso " + piso + " es: $" + costoHabitacion);
        
        System.out.println("\tSeleccione el método de pago:");
        System.out.println("1. Transferencia");
        System.out.println("2. Efectivo");
        System.out.println("3. Tarjeta \t (Este método cuenta con un recargo del 10 porciento del costo de la habitación.)");
        System.out.println();
        
        int opcionPago = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcionPago) {
            case 1:
                System.out.println("Ha seleccionado pago por transferencia. \nDebe pagar: " + costoHabitacion);
                break;
            case 2:
                System.out.println("Ha seleccionado pago en efectivo. \nDebe pagar: " + costoHabitacion);
                break;
            case 3:
                costoHabitacion += costoHabitacion * 0.1;
                System.out.println("Ha seleccionado pago con tarjeta. \nDebe pagar: " + costoHabitacion);
                break;
            default:
                System.out.println("Opción de pago no válida.");
                break;
        }

        totalAcumulado += costoHabitacion;
        System.out.println("Total acumulado hasta el momento: $" + totalAcumulado);
    }
}


