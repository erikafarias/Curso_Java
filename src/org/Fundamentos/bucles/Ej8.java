package bucles;

import java.util.Scanner;

//8. Se tiene un arreglo de 15 filas y 12 columnas. Realice un algoritmo que permita leer el
//        arreglo y que calcule y presente los resultados siguientes:
//        El menor elemento del arreglo; la suma de los elementos de las cinco primeras filas del
//        arreglo; y el total de elementos negativos en las columnas de la quinta a la nueve.
public class Ej_8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("A continuación ingrese los valores para un arreglo de 15 filas y 12 columnas");
        int filas = 15, columnas = 12;
        int matriz[][] = new int[filas][columnas];
        int menor, sum, negativos;
        menor = 999999999;
        sum=0;
        negativos=0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; i++){
                System.out.printf("Ingrese el valor en (%d, %d): ", i, j);
                matriz[i][j] = read.nextInt();
                if( matriz[i][j]<menor){
                    menor = matriz[i][j];
                }
                if (i<5){
                    sum += matriz[i][j];
                }
                if (j>=4 && j<9){
                    if (matriz[i][j]<0){
                        negativos++;
                    }
                }
            }
        }
        System.out.println("El menor elemento del arreglo es: " + menor);
        System.out.println("La suma de los elementos de las cinco primeras filas del arreglo es igual a " + sum);
        System.out.println("El total de elementos negativos en las columnas de la quinta a la nueve es de " + negativos);
    }
}
