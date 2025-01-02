package bases;

import java.util.Scanner;

public class OrdenarDosNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("**** Ordenamiento de dos numeros ****  \n ingrese ' 00 ' para finalizar el programa ");

        System.out.println("porfavor ingrese el primer numero : ");
        Integer numeroUno = 0;
        numeroUno = s.nextInt();

        if (numeroUno.equals(00)){
            System.out.println("Hasta luego!!");
            System.exit(0);
        }

        System.out.println("porfavor ingrese el segundo numero : ");
        Integer numeroDos = 0;
        numeroDos = s.nextInt();

        Integer max = 0;

        if (numeroUno.equals(numeroDos)){
            max   = numeroUno;
            System.out.println("ambos valores son iguales! \n " + "numero 1 : "
                    + numeroUno + "\n " + "numero 2 : " + numeroDos);
        }else{
            max   = numeroUno > numeroDos ? numeroUno :  numeroDos;
            System.out.println("el numero mayor es  = " + max);
        }
        main(args);

    }
}
