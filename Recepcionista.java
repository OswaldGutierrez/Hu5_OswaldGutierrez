public class Recepcionista {
    
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

   
}
