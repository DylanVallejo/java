package arreglos;


import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[3];
        int total = productos.length;

        productos[0] = "Kingston pendrive 64gb";
        productos[1] = "Samsung galaxy";
        productos[2] = "Disco duro SSD Samsung externo";
//      siempre ordenar antes de iterar
        Arrays.sort(productos);
        System.out.println("usando for");
//      si evaluamos el length en el for evalua por cada iteracion la longitud;
        for (int i = 0; i < total; i++ ){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }
        System.out.println("usando for each");
        for (String prod: productos){
            System.out.println("prod = " + prod);
        }
        int i = 0;

        System.out.println("usando while");
        while(i < total){
            System.out.println("par indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("usando do while");
        int j = 0;
        do{
            System.out.println("par indice " + j + " : " + productos[j]);
            j++;
        }while(j < total);

        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for(int k = 0; k < totalNumeros; k++){
           numeros[k] = k * 3;
        }

        for(int k = 0; k < totalNumeros; k++){
            System.out.println("numeros = " + numeros[k]);
        }

    }
}
