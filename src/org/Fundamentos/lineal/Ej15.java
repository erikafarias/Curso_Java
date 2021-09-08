package clases;
import java.util.Scanner;
public class Ejercicio15_2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final double RESISTENCIA = 4;
        double voltaje, corriente;
        boolean bandera = true;
        int opcion;

        System.out.println("----Circuito Electrico----");
        while(bandera) {
            System.out.println("Ingrese una opción:");
            System.out.println("2- Calcular Potencia sabiendo Resistencia y Voltaje");
            System.out.println("1- Calcular Potencia sabiendo Resistencia y Corriente");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la Corriente en Amperes:");
                    corriente = lector.nextDouble();
                    voltaje = RESISTENCIA * corriente;
                    bandera = isBandera(voltaje, corriente);
                    break;
                case 2:
                    System.out.println("Ingrese el Voltaje en Volts:");
                    voltaje = lector.nextDouble();
                    corriente = voltaje / RESISTENCIA;
                    bandera = isBandera(voltaje, corriente);
                    break;
                default:
                    System.out.println("No ingreso una opción válida");
                    break;
            }
        }
    }

    private static boolean isBandera(double voltaje, double corriente) {
        double potencia;
        boolean bandera;
        potencia = voltaje * corriente;
        System.out.printf("La Potencia del circuito es %.2f", potencia);
        bandera=false;
        return bandera;
    }
}

