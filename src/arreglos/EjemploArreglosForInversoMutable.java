package arreglos;


import java.util.Arrays;


public class EjemploArreglosForInversoMutable {


    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
//          invirtiendo un arreglo
            arreglo[ total - 1 - i ] = actual;
            total2--;
        }

    }

    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 64gb", "Samsung galaxy","Disco duro SSD Samsung externo"};
        int total = productos.length;

        Arrays.sort(productos);
//        invirtiendo mediante el api de Collections
//        Collections.reverse(Arrays.asList(productos));

        arregloInverso(productos);
        System.out.println(" ==== usando for ==== ");
        for (int i = 0; i < total; i++ ){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

    }
}
