package bases;

public class PasarPorValor {
    public static void main(String[] args) {
//        todos los  primitivos se pasan por valor y no por referencia
//        todos los wrapper de primitivos son inmutables por lo que al pasar un valor crea una instancia nueva
        int i = 10;
        System.out.println("iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con el valor de i (se mantiene igual)= " + i);
    }

    public static void test( Integer i ){
        System.out.println("iniciamos el método test con i = " + i);
        i= 35;
        System.out.println("Finaliza el método test con i = " + i);
    }

}
