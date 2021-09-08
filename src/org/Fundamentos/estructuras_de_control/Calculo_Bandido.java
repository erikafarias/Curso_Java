package estructuras_de_control;

import java.util.Scanner;

public class Calculo_Bandido {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float pagoMinimoAnterior, interesAcumulado, multaPorPagoMenorAlMinimo, saldoActual, pagoMinimoActual,
                pagoParaNoGenerarIntereses, saldoAnterior, montoTotalComprasRealizadas, pagoCorteAnterior;
        System.out.println("Introduzca el valor del saldo anterior del cliente: ");
        saldoAnterior = read.nextFloat();
        System.out.println("Introduzca el monto total de las compras que realizó: ");
        montoTotalComprasRealizadas = read.nextFloat();
        System.out.println("Introduzca el valor del pago que realizó en el corte anterior: ");
        pagoCorteAnterior = read.nextFloat();
        pagoMinimoAnterior = saldoAnterior * 0.15f;
        if (pagoCorteAnterior>pagoMinimoAnterior){
            interesAcumulado = 0;
            multaPorPagoMenorAlMinimo = 0;
        } else {
            interesAcumulado = saldoAnterior * 0.12f;
            multaPorPagoMenorAlMinimo = 200;
        }
        saldoActual = saldoAnterior + montoTotalComprasRealizadas + interesAcumulado + multaPorPagoMenorAlMinimo - pagoCorteAnterior;
        pagoMinimoActual = saldoActual * 0.15f;
        pagoParaNoGenerarIntereses = saldoActual * 0.85f;
        System.out.println("Valor de pago minimo: " + pagoMinimoActual);
        System.out.println("Valor de pago para no generar intereses: " + pagoParaNoGenerarIntereses);
        System.out.println("Valor de saldo actual: " + saldoActual);
    }
}
