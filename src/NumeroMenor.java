import java.lang.reflect.Array;
import java.util.List;

public class NumeroMenor {
    public static void main(String[] args) {

        int[] numeros = {2,1,3,10,0,-2,4};
        int min = numeros[0];
        for (int numero : numeros) {
            if (numero < min ) {
                min = numero;
            }
        }
        System.out.println("min = " + min);
    }
}
