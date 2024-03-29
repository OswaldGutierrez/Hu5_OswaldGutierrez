import java.util.Scanner;

public class LecturaDatos {
    
    Scanner entrada = new Scanner (System.in);

    public String leerString(String mensaje){
        System.out.println(mensaje+": ");
        return entrada.nextLine() ;
    }
    
    public int leerInt(String mensaje){
        System.out.println(mensaje+": ");
        int dato = entrada.nextInt();
        return dato;
    }

    public float leerFloat(String mensaje){
        System.out.println(mensaje);
        float datoFloat = entrada.nextFloat();
        return datoFloat;
    }

    public double leerDouble(String mensaje){
        System.out.println(mensaje);
        double datoDouble = entrada.nextDouble();
        return datoDouble;
    }


    public int leeryValidarInt(String mensaje) {
        int dato;
        do {
            System.out.print(mensaje + "\n");
            while (!entrada.hasNextInt()) {
                System.out.println("Valor no válido");
                entrada.next();
                System.out.print("Ingrese un valor válido. \n");
            }
            dato = entrada.nextInt();
            if(dato < 0){
                System.out.println("El número debe ser positivo");
            }
        } while (dato <= 0);
        return dato;
    }
    
}
