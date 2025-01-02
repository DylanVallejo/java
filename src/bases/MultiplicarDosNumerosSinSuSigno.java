package bases;

import java.util.Scanner;

public class MultiplicarDosNumerosSinSuSigno {

    public static void main(String[] args) {

        int total = 0;
        int valorUno = 0;
        int valorDos = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer valor = ");
        valorUno = scanner.nextInt();
        System.out.println("Ingrese el segundo valor = ");
        valorDos = scanner.nextInt();
        int valorPositivos = Math.abs(valorDos);

        for(int i = 0; i < valorPositivos; i++){
            total += valorUno;
        }

        if ((valorUno < 0 && valorPositivos > 0) || (valorUno > 0 && valorPositivos < 0)) {
            total = -total;
        }
        System.out.println("total = " + total);

    }
}
