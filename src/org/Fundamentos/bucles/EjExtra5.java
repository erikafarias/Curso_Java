package bucles;

//Vamos a plantear y resolver un ejercicio: queremos almacenar en una matriz el número de alumnos con
//        el que cuenta una academia, ordenados en función del nivel y del idioma que se estudia. Tendremos 3
//        filas que representarán al Nivel básico, medio y de perfeccionamiento y 4 columnas en las que figurarán
//        los idiomas (0 = Inglés, 1 = Francés, 2 = Alemán y 3 = Ruso). Se pide realizar la declaración de la matriz y
//        asignarle unos valores de ejemplo a cada elemento.

import java.util.Scanner;

public class EjExtra5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] idiomas = {"Inglés", "Francés", "Alemán", "Ruso"};
        String[] niveles = {"Básico", "Medio", "Perfeccionamiento"};
        int nroNiveles = niveles.length, nroIdiomas = idiomas.length;
        int matriz[][] = new int[nroNiveles][nroIdiomas];
        for (int i = 0; i < nroNiveles; i++) {
            for (int j = 0; j < nroIdiomas; j++) {
                System.out.printf("Ingrese la cantidad de alumnos en el nivel %s de %s: \n", niveles[i], idiomas[j]);
                matriz[i][j] = read.nextInt();
            }
        }
        System.out.println("La matriz queda como: ");
        System.out.println("\t \t \t \t \t \t" + idiomas[0] + "\t" + idiomas[1] + "\t" + idiomas[2] + "\t" + idiomas[3]);
        for (int i = 0; i < nroNiveles; i++) {
            if (i < 2) {
                System.out.print(niveles[i] + "\t \t \t \t \t");
            } else {
                System.out.print(niveles[i] + "\t \t");
            }
            for (int j = 0; j < nroIdiomas; j++) {
                System.out.printf("|%d| \t", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
