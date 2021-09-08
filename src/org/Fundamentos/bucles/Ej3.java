package bucles;
//3. Realice un algoritmo que lea un arreglo de M filas y N columnas y que calcule la suma de los elementos de la
//        diagonal principal.

import java.util.Scanner;

public class Ej_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese num de filas y columnas: ");
        int m = read.nextInt();

        int matriz[][] = new int[m][m];
        int suma = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Ingrese el valor en (%d, %d): ", i, j);
                matriz[i][j] = read.nextInt();
                if (i == j) {
                    suma += matriz[i][j];
                }
            }
        }

        System.out.println("La suma de la diagonal es igual a " + suma);

    }
}
