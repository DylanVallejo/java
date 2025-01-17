package bases;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer  num1 = Integer.valueOf(1000);
        Integer num2 = num1;
        System.out.println("num1 = " + num1);

        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto " + (num1 == num2));

        num2 = 1000;
        System.out.println("num1 = " + num1);

        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto " + (num1 == num2));
//      comparar objetos y valor no es lo mismo ya que si comparamos objetos
//        reotrnara ture hace referencia almismo objeto

//        equals compara el valor del objeto
        System.out.println("Tienen el mismo valor " + (num1.equals(num2)));
        System.out.println("Tienen el mismo valor " + (num1.intValue() == num2.intValue()));

//        igual compara primitivos por valor equals por referencias
//        == en referencias compara la instancia java puede comparar hasta el valor de 127

        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);

//      se debe evitar el uso de == en tipos de referencia
    }
}
