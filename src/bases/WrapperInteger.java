package bases;

public class WrapperInteger {
    public static void main(String[] args) {

//      int primitivo
        int intPrimitivo = 32768;

//      wrapper boxing se realiza la asiganacion manual ddel valor
//         Integer intObjeto = Integer.valueOf(32768);
        Integer intObjeto = Integer.valueOf(intPrimitivo);

//      autoboxing se realiza la asignacion automatica
        Integer intObjeto2 = intPrimitivo;

        System.out.println("intObjeto = " + intObjeto);

//        transforma un integer de referencia rapper  a un primitivo automaticamente
        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);


        String valorTvLcd = "6700";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjet = intObjeto.shortValue();


        Byte byteObject = intObjeto.byteValue();
        System.out.println("byteObject = " + byteObject);

        Long longObject = intObjeto.longValue();
        System.out.println("longObject = " + longObject);
    }
}
