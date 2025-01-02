package bases;

public class PrimitivosFloat {
//variable de la clase del tipo static
    static float varFlotante2;
    public static void main(String[] args) {
        //se puede escribir el dato en notacion cientifica
        //al imprimirlo nos dara el resultado compacto
        float realFloat = 1.5e-10f;  // 15000f
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo realFloat corresponde en byte  a: "+ Float.BYTES);
        System.out.println("tipo realFloat corresponde en bit a : "+ Float.SIZE);
        System.out.println("valor maximo de un realFloat: "+ Float.MAX_VALUE);
        System.out.println("valor minimo de un realFloat: "+ Float.MIN_VALUE);
        System.out.println("/////// /////////////");

//        double
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en byte  a: "+ Double.BYTES);
        System.out.println("tipo double corresponde en bit a : "+ Double.SIZE);
        System.out.println("valor maximo de un double: "+ Double.MAX_VALUE);
        System.out.println("valor minimo de un double: "+ Double.MIN_VALUE);
        System.out.println("/////// /////////////");


        //como se comporta var
        float varFlotante = 3.1416f;
        System.out.println("varflotante = " + varFlotante);
        //dentro de la clase main no obtienen valores por defecto
        System.out.println(varFlotante2);

    }
}
