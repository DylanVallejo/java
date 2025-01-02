package bases;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String  variable = 7 == 7 ? "si es verdadero " : "si es falso " ;
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas =  0.0;
        double ciencias = 0.0;
        double historia = 0.0;



        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematicas em escala de  2.0 a 7 ");
        matematicas = s.nextDouble();


        System.out.println("Ingrese la nota de ciencias de  2.0 a 7 ");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia em escala de  2.0 a 7 ");
        historia = s.nextDouble();

        promedio  = (matematicas + ciencias +  historia) / 3;
        estado  = promedio  >= 5.49 ? "Aprobado " : "Rechazado";
        System.out.println("estado = " + estado + "con el promedio de  " + promedio);

    }
}
