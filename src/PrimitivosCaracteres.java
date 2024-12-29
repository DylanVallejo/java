public class PrimitivosCaracteres {
    public static void main(String[] args) {
        //podemos usar los valores unicode
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("caracter = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));


        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retrocesosCarro = '\r';
        System.out.println("tipo char corresponde en byte  a : " + espacio + Character.BYTES);
        System.out.println("tipo char corresponde en bit a : "+ Character.SIZE);
        System.out.println("valor maximo de un double: "+ Character.MAX_VALUE);
        System.out.println("valor minimo de un double: "+ Character.MIN_VALUE);
        System.out.println("////////////////////");


    }
}
