public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {

        if (args.length != 3){
            System.out.println(" Por favor, ingresar una operación ( suma, resta, multiplicación , o división ) y dos entéros: ");
            System.exit(-1);
        }
        String operacion = args[0];

        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;

        switch (operacion){
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "dividir":
                if (b == 0 ){
                    System.exit(-1);
                    System.out.println("no se puede dividir por cero");
                }
                resultado = (double) a / b;
                break;
            default:
                resultado = a+b;
        }

        System.out.println("El resultado de la operación" + operacion + " es : " + resultado);

    }
}
