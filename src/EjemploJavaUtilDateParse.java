import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) throws ParseException {

//        parse trasnfroma strings a fechas
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd' ");
        Date fecha  = format.parse(scanner.next());
        System.out.println("fecha = " + fecha);
        System.out.println("format = " + format.format(fecha));

    }
}
