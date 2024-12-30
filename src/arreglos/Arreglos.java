package arreglos;

public class Arreglos {
    public static void main(String[] args) {

        int[] numeros = new int[4];


        numeros[0] = 1;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 3;
        numeros[3] = 4; // generara un index outbound exception


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
