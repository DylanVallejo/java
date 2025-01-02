package bases;

public class OperadorInstanceOf {
    public static void main(String[] args) {

//        podemos instanciar obejtos de referencias para algunos primitivos
//   *** SE LLAMA AUTOBOXING ***

//        esto realiza de forma implicita la creacion de un String texto  = new String("mensaje")
        String texto = "creando un objeto de la clase String";

//        Integer num = new Integer(7);
        Integer num = 7;

//        validmos si es un tipo de una clase
        Boolean b1 = texto instanceof String;
        System.out.println(" texto Es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto Es del tipo Object = " + b1);


        b1 = num instanceof Integer;
        System.out.println("num Es del tipo Integer = " +  b1);

        b1 = num instanceof Number;
        System.out.println("num Es del tipo Number = " +  b1);

        b1 = num instanceof Object;
        System.out.println("num Es del tipo Object = " +  b1);


        Double decimal = 45.45;
        b1 = decimal instanceof Number;
        System.out.println("decimal Es del tipo Number = " +  b1);


        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Bolean = " + b1);
//        Object es la clase padre de tod0 de ahi heredan todas las clases

    }
}
