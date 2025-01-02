package bases;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max  = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int num1 = s.nextInt();

        System.out.println("ingrese un segundo numero : ");
        int num2 = s.nextInt();

        System.out.println("ingrese el tercer numero: ");
        int num3 = s.nextInt();
        System.out.println("ingrese el tercer numero: ");
        int num4 = s.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("max = " + max);




    }
}
