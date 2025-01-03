package arreglos;


import java.util.Arrays;

public class EjemploArreglosForInverso {
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
        System.out.println("usando for inverso = ");
        for(int i = 0; i< total; i++){
            System.out.println("para i =  = " + ( total - 1 - i ) + " valor: " + productos[total-1-i]);
        }

        System.out.println("======== inverso dos ========");
        for (int i = total - 1; i >= 0; i--){
            System.out.println("para i  = " +  i + " valor " + productos[i] );
        }


    }
}
