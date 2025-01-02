package bases;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while(numeros.size() < 10){
            System.out.println("ingrese un  numero: ");
            int numeroIngresado = scanner.nextInt();
            numeros.add(numeroIngresado);
        }
        int min = numeros.get(0);
        for (int numero : numeros) {
            if (numero < min ) {
                min = numero;
            }
        }
        if (min < 10){
            System.out.println("El numero menor es menor que 10! : " + min);
        }else {
            System.out.println("El numero menor es mayor o igual que 10! : " + min );
        }

    }
}
