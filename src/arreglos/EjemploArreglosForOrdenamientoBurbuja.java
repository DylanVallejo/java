package arreglos;


import java.util.Arrays;
import java.util.Objects;

public class EjemploArreglosForOrdenamientoBurbuja {


    public static void arregloInverso(String[] arreglo){
//        int total2 = arreglo.length;
//        int total = arreglo.length;
//        for (int i = 0; i < total2; i++){
//            String actual = arreglo[i];
//            String inverso = arreglo[total-1-i];
//            arreglo[i] = inverso;
////          invirtiendo un arreglo
//            arreglo[ total - 1 - i ] = actual;
//            total2--;
//        }

    }

    public static void sortBurbuja(Object[] arreglo) {
        int total = arreglo.length;

        int contador = 0;
        for(int i =0; i < total - 1; i++ ){
            for( int j = 0; j < total -1 -i ; j++ ){
//                compara el elemento actual contra el siguiente el ordenamiento es case sensitive
                if (( (Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0 ){
                    Object auxiliarIntermedia = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliarIntermedia;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

    }

    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 64gb", "Samsung galaxy","Disco duro SSD Samsung externo", "Asus notebook", "Bitcoin"};
        int total = productos.length;

        sortBurbuja(productos);
        System.out.println(" ==== usando for ==== ");

        for (int i = 0; i < total; i++ ){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;


        sortBurbuja(numeros);
        for (int i = 0; i < numeros.length; i ++){
            System.out.println("i = " + i + " : "+ numeros[i]);
        }

    }
}
