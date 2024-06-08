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

        Date fecha2 = new Date();
        if(fecha.after(fecha2)){
            System.out.println(" Fecha del usuario es despues que fecha 2 (actual)");
        } else if (fecha.before(fecha2)) {
            System.out.println(" Fecha es anterior a fecha2");
        } else if (fecha.equals(fecha2)) {
            System.out.println("Las fechas son iguales");
        }

        if(fecha.compareTo(fecha2) > 0 ){
            System.out.println("fecha del usuario es despues que fecha2 (actual)");
        } else if (fecha.compareTo(fecha2) < 0) {
            System.out.println("fecha es anterior que fecha2");
        } else if (fecha.compareTo(fecha2) == 0) {
            System.out.println("fecha es igual a fecha2");
        }

    }
}
