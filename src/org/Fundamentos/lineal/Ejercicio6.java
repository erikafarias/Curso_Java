package clases;

import java.util.*;

// 6. Se requiere determinar la hipotenusa de un triángulo rectángulo.
public class Ejercicio6 {
    public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;
        Scanner lector = new Scanner(System.in);
        System.out.println("Calcularemos la hipotenusa de un triángulo rectángulo");
        System.out.println("Ingrese la medida del primer cateto");
        cateto1 = lector.nextDouble();
        System.out.println("Ingrese la medida del segundo cateto");
        cateto2 = lector.nextDouble();
        //        hipotenusa = Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La hipotenusa del triángulo es " + hipotenusa);
    }
}
