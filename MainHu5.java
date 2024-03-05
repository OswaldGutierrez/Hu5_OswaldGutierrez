public class MainHu5 {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Recepcionista recepcionista = new Recepcionista();

        
        recepcionista.mostrarEstadoHabitaciones(hotel);
        System.out.println();
        hotel.reservarHabitacion();
        hotel.reservarHabitacion();
        recepcionista.mostrarEstadoHabitaciones(hotel);
        hotel.dejarHabitacion();
        recepcionista.mostrarEstadoHabitaciones(hotel);
    }
    
}
