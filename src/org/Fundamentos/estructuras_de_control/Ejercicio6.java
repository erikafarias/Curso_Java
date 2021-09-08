package estructuras_de_control;

import java.util.Scanner;

//6. Realice el diagrama de flujo y el pseudocódigo que muestren el algoritmo para
//        determinar el costo y el descuento que tendrá un artículo. Considere que si su precio es
//        mayor o igual a $200 se le aplica un descuento de 15%, y si su precio es mayor a $100
//        pero menor a $200, el descuento es de 12%, y si es menor a $100, sólo 10%.
public class Ejercicio6 {
    public static void main(String[] args) {
        float descuento, precio, precioConDescuento;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        precio = read.nextFloat();

        if (precio >= 200) {
            descuento = 0.15f;
        } else if (precio >= 100){
            descuento = 0.12f;
        } else {
            descuento = 0.10f;
        }
        float porcentaje = descuento*100;
        precioConDescuento = precio*(1-descuento);
        System.out.printf("El precio de su producto con un descuento del %s%.0f es de $%.2f. %n", "%", porcentaje,
                precioConDescuento);
        System.out.println("El precio final es de $" + precioConDescuento);
    }
}