public class PrimitivosEnteros {
//    tipos de primitivos en Java
    public static void main(String[] args) {

//        byte : representan un solo byte representan 8 bits
//        soporta entre 127 +/-
        byte numeroByte = 127;
        System.out.println(numeroByte);
        System.out.println("tipo byte corresponde en byte  a: "+ Byte.BYTES);
        System.out.println("tipo byte corresponde en bit a : "+ Byte.SIZE);
        System.out.println("valor maximo de un byte: "+ Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte: "+ Byte.MIN_VALUE);
        System.out.println("/////// /////////////");
// short : dos bytes 16 bits
        short numeroShort = 3000;
        System.out.println("numero short = " + numeroShort);
        System.out.println("tipo short corresponde en byte  a: "+ Short.BYTES);
        System.out.println("tipo short corresponde en bit a : "+ Short.SIZE);
        System.out.println("valor maximo de un short: "+ Short.MAX_VALUE);
        System.out.println("valor minimo de un short: "+ Short.MIN_VALUE);
        System.out.println("/////// /////////////");

//        int no es lo mismo que la clase Integer
        int numeroInt = 32768;
        System.out.println("numero int = " + numeroInt);
        System.out.println("tipo int corresponde en byte  a: "+ Integer.BYTES);
        System.out.println("tipo int corresponde en bit a : "+ Integer.SIZE);
        System.out.println("valor maximo de un int: "+ Integer.MAX_VALUE);
        System.out.println("valor minimo de un int: "+ Integer.MIN_VALUE);
        System.out.println("/////// /////////////");


//        long o super integer
        long numeroLong = 9223372036854775807L;

        System.out.println("numero long = " + numeroLong);
        System.out.println("tipo long corresponde en byte  a: "+ Long.BYTES);
        System.out.println("tipo long corresponde en bit a : "+ Long.SIZE);
        System.out.println("valor maximo de un long: "+ Long.MAX_VALUE);
        System.out.println("valor minimo de un long: "+ Long.MIN_VALUE);
        System.out.println("/////// /////////////");

        //var es dinamico no existe en java 8 de 10 en adelante cambio
        //su tipo automaticamente
        var numeroVar = 92233720368547758079f; //127 maximo valor de un byte
        System.out.println("tipo var = " + numeroVar);

        System.out.println("/////// /////////////");


    }
}
