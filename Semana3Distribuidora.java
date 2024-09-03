import java.util.Scanner;

public class Semana3Distribuidora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos de entrada
        System.out.println("Ingrese la marca del vehículo:");
        String marca = scanner.nextLine();
        
        System.out.println("Ingrese el modelo del vehículo:");
        String modelo = scanner.nextLine();
        
        System.out.println("Ingrese la cilindrada del vehículo:");
        String cilindrada = scanner.nextLine();
        
        System.out.println("Ingrese el tipo de combustible del vehículo:");
        String tipoCombustible = scanner.nextLine();
        
        System.out.println("Ingrese la capacidad en pasajeros del vehículo:");
        int capacidadPasajeros = scanner.nextInt();
        
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");
    }
}
