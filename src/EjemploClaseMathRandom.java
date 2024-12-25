import java.io.FileWriter;
import java.io.FilterReader;
import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {


        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        double random = Math.random();
        System.out.println("random : " + random);
        random *=  colores.length;

        System.out.println(random);

        random = Math.floor(random);
        System.out.println(random);

        System.out.println("colores = " + colores[ (int) random]);

        Random randomObject = new Random();
        // definimos un aleatorio entre 15 y 25
        int randomInt = 15 + randomObject.nextInt(25-15);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObject.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);

        System.out.println("colores = " + colores[randomInt]);



    }
}
