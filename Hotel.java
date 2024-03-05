public class Hotel {
    LecturaDatos in = new LecturaDatos();

    private String[][] habitaciones;

    private int piso;
    private int numero;

    public int getPiso() {
        return piso;
    }

    public int getNumero() {
        return piso;
    }

    public String[][] getHabitaciones() {
        return habitaciones;
    }

    public Hotel() {
        this.habitaciones = new String[2][5];
        // Inicializar todas las habitaciones como disponibles
        for (String[] piso : habitaciones) {
            for (int habitacion = 0; habitacion < piso.length; habitacion++) {
                piso[habitacion] = "Disponible";
            }
        }
    }

    public void reservarHabitacion() {

        piso = in.leerInt("¿En qué piso quiere su habitación?");
        numero = in.leerInt("¿Cuál de las habitaciones desea?");

        if (piso >= 1 && piso <= 2 && numero >= 1 && numero <= 5) {
            if (habitaciones[piso - 1][numero - 1].equals("Disponible")) {
                habitaciones[piso - 1][numero - 1] = "Ocupada";
                System.out.println("Habitación en el piso " + piso + " y número " + numero + " reservada con éxito.");
                System.out.println();
            } 
            else {
                System.out.println("La habitación en el piso " + piso + " y número " + numero + " ya está ocupada.");
            }
        }
        
        else {
            System.out.println("La habitación especificada no existe en el hotel.");
        }
    }

    public void dejarHabitacion() {

        piso = in.leerInt("¿En qué piso se encuentra la habitación que entregará?");
        numero = in.leerInt("¿Qué número de habitación es?");

        if (piso >= 1 && piso <= 2 && numero >= 1 && numero <= 5) {
            if (habitaciones[piso - 1][numero - 1].equals("Ocupada")) {
                habitaciones[piso - 1][numero - 1] = "Disponible";
                System.out.println("Habitación en el piso " + piso + " y número " + numero + " ha finalizado su estadía.");
            }
            else {
                System.out.println("La habitación en el piso " + piso + " y número " + numero + "ya ha sido abandonada.");
            }
        
        
        }
        else {
            System.out.println("La habitación especificada no existe en el hotel.");
        }
    }


    public int dejarHabitacionPrueba() {
        int pisoEntregado = in.leerInt("¿En qué piso se encuentra la habitación que entregará?");
        int numeroEntregado = in.leerInt("¿Qué número de habitación es?");

        if (pisoEntregado >= 1 && pisoEntregado <= 2 && numeroEntregado >= 1 && numeroEntregado <= 5) {
            if (habitaciones[pisoEntregado - 1][numeroEntregado - 1].equals("Ocupada")) {
                habitaciones[pisoEntregado - 1][numeroEntregado - 1] = "Disponible";
                System.out.println("Habitación en el piso " + pisoEntregado + " y número " + numeroEntregado + " ha finalizado su estadía.");
                return pisoEntregado; // Devolver el número del piso de la habitación entregada
            } else {
                System.out.println("La habitación en el piso " + pisoEntregado + " y número " + numeroEntregado + " ya ha sido abandonada.");
            }
        } else {
            System.out.println("La habitación especificada no existe en el hotel.");
        }
        return -1; // Si la habitación no se entregó correctamente, retornamos -1
    }


}
