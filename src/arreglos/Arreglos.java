package arreglos;

import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {

        String[] productos = new String[3];

        productos[0] = "Kingston pendrive 64gb";
        productos[1] = "Samsung galaxy";
        productos[2] = "Disco duro SSD Samsung externo";


        Arrays.sort(productos);

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);



        int[] numeros = new int[4];


        numeros[0] = 1;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 32;
        numeros[3] = 4; // generara un index outbound exception

        Arrays.sort(numeros);
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);



    }
}
