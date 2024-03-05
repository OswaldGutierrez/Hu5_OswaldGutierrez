import java.util.Scanner;

public class Ingresos {
    private Scanner scanner = new Scanner(System.in);
    LecturaDatos in = new LecturaDatos();

    private int pisoPago;


    public void procesarPago() {
        pisoPago = in.leeryValidarInt("Para corrobar la información, ¿En qué piso se encuentra su habitación?");

        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Transferencia");
        System.out.println("2. Efectivo");
        System.out.println("3. Tarjeta");
        int opcionPago = scanner.nextInt();
        scanner.nextLine();

        double costoHabitacion = calcularCostoHabitacion(pisoPago);
        System.out.println("El costo de la habitación es: $" + costoHabitacion);

        switch (opcionPago) {
            case 1:
                System.out.println("Ha seleccionado pago por transferencia. Debe pagar: " + costoHabitacion);
                break;
            case 2:
                System.out.println("Ha seleccionado pago en efectivo. Debe pagar: " + costoHabitacion);
                break;
            case 3:
                costoHabitacion += costoHabitacion * 0.1;
                System.out.println("Ha seleccionado pago con tarjeta. La cual, tiene un recargo del 10 porciento. Debe pagar: " + costoHabitacion);

                break;
            default:
                System.out.println("Opción de pago no válida.");
                break;
        }
    }

    private double calcularCostoHabitacion(int pisoPago) {
        double costoBase;
        if (pisoPago == 1) {
            costoBase = 375000;
        } else if (pisoPago == 2) {
            costoBase = 415000;
        } else {
            costoBase = 0;
        }
        return costoBase;
    }
}
