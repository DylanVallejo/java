import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) throws ParseException {
//      TODO  calcular la edad de una persona ingresando la fecha
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        System.out.println(" Ingrese su fecha de nacimiento en el formato dd-MM-yyyy (18-11-1998) ");
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaIngresada = formato.parse(scanner.next());
//        TODO CALCULAR CON PRESICION TOAMNDO EN CUENTA MESES Y DIAS
        int actualYear = calendar.get(Calendar.YEAR);
        calendar.setTime(fechaIngresada);
        int bornYear = calendar.get(Calendar.YEAR);
        int age = actualYear - bornYear;
        System.out.println("age = " + age);

    }
}
