public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

//        podemos instanciar obejtos de referencias para algunos primitivos
//   *** SE LLAMA AUTOBOXING ***

//        esto realiza de forma implicita la creacion de un String texto  = new String("mensaje")
        Object texto = "creando un objeto de la clase String";

//        Integer num = new Integer(7); esto esta deprecado

//        la mejor froma de crear una instancia es utilizar value.of podemos pasar como parametro un string o
//        numero primitivo

//        Number num = 7;
        Number num = Integer.valueOf(7);


//        validmos si es un tipo de una clase
        Boolean b1 = texto instanceof String;
        System.out.println(" texto Es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto Es del tipo Object = " + b1);

        b1  = texto instanceof  Integer;
        System.out.println("texto es del tipo integer = " + b1);


        b1 = num instanceof Integer;
        System.out.println("num Es del tipo Integer = " +  b1);

        b1 = num instanceof Number;
        System.out.println("num Es del tipo Number = " +  b1);

        b1 = num instanceof Object;
        System.out.println("num Es del tipo Object = " +  b1);

        b1 = num instanceof  Long;
        System.out.println("num es del tipo Long  = " + b1 );

        b1 = num instanceof  Double;
        System.out.println("num es del tipo Double  = " + b1 );

        Number decimal = Float.valueOf(45.45f);
        b1 = decimal instanceof  Double;
        System.out.println("decimal es instancia de Double  = " + b1);

        b1 = decimal instanceof  Float;
        System.out.println("decimal es instancia de Float  = " + b1);


        b1 = decimal instanceof  Integer;
        System.out.println("decimal es instancia de Integer  = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal Es del tipo Number = " +  b1);


        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Bolean = " + b1);
//        Object es la clase padre de tod0 de ahi heredan todas las clases

    }
}
