package arreglos;


import java.util.Arrays;

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

    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 64gb", "Samsung galaxy","Disco duro SSD Samsung externo", "Asus notebook", "Bitcoin"};
        int total = productos.length;

        int contador = 0;
        for(int i =0; i< total - 1; i++ ){
            for( int j = 0; j < total -1 -i ; j++ ){
//                compara el elemento actual contra el siguiente el ordenamiento es case sensitive
                if (productos[j+1].compareTo(productos[j]) < 0 ){
                    String auxiliarIntermedia = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliarIntermedia;
                }
                contador++;
            }
        }
//        Arrays.sort(productos);
//        invirtiendo mediante el api de Collections
//        Collections.reverse(Arrays.asList(productos));

        arregloInverso(productos);
        System.out.println(" ==== usando for ==== ");
        System.out.println("contador = " + contador);
        for (int i = 0; i < total; i++ ){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

    }
}
