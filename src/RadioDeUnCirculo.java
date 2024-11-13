import java.text.DecimalFormat;
import java.util.Scanner;

public class RadioDeUnCirculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double PI = Math.PI;
        double radio = 0.0;
        double area = 0.0;
        final String ERROR = "Entrada no válida. Por favor, ingrese un número valido.";
        final String PREGUNTA = "Ingrese el rádio del círculo: ";
        final String PATRON_DOUBLE = "#.00";

        System.out.print(PREGUNTA);
        String radioIngresado = sc.nextLine();
        DecimalFormat df = new DecimalFormat(PATRON_DOUBLE);

        try {
            radio = Double.parseDouble(radioIngresado);
            area = PI * Math.pow(radio, 2);
            double areaRedondeada = Double.parseDouble(df.format(area));
            System.out.println("El área del círculo es: " + areaRedondeada);
        }catch (NumberFormatException e) {
            System.out.println(ERROR);
            main(args);
        }

    }
}
