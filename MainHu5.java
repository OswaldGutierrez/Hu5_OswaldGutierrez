public class MainHu5 {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Recepcionista recepcionista = new Recepcionista();
        Ingresoss ingresoss = new Ingresoss();
        FinTurno finTurno = new FinTurno(hotel, ingresoss, recepcionista);

        
        System.out.println("Bienvenido al Hotel Hilton. \nEl Hotel Hilton cuenta con 2 pisos y 5 habitaciones en cada uno de ellos. \n");

        recepcionista.mostrarEstadoHabitaciones(hotel);
        System.out.println();
        recepcionista.gestionarReservas(hotel);
        System.out.println();
        recepcionista.mostrarEstadoHabitaciones(hotel);
        System.out.println();
        recepcionista.hacerChecksOut(hotel);
        finTurno.entregarTurno();
        recepcionista.mostrarEstadoHabitaciones(hotel);

        
    }
    
}
