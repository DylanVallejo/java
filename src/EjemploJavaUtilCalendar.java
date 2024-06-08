import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2023, 11 , 6, 19, 55, 0);
        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 20);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HHs:mm:ss a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("Fecha con formato = " + fechaConFormato);

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = calActual.getTime();


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
