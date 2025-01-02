package bases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        System.out.println(" Ingrese su fecha de nacimiento en el formato dd-MM-yyyy (18-11-1998) ");
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaIngresada = formato.parse(scanner.next());
        int actualYear = calendar.get(Calendar.YEAR);
        int actualMonth = calendar.get(Calendar.MONTH);
        int actualDay  = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("actualYear = " + actualYear);
        System.out.println("actualMonth = " + actualMonth);
        System.out.println("actualDay = " + actualDay);
        calendar.setTime(fechaIngresada);
        System.out.println("fechaIngresada = " + fechaIngresada);
        int bornYear = calendar.get(Calendar.YEAR);
        int bornMonth = calendar.get(Calendar.MONTH);
        int bornDay = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("bornYear = " + bornYear);
        System.out.println("bornMonth = " + bornMonth);
        System.out.println("bornDay = " + bornDay);
        int age = 0;
        age = actualYear - bornYear;
        if (    actualMonth < bornMonth  && actualDay  < bornDay ){
             age  = age - 1;
        } else if ( actualMonth < bornMonth ) {
            age  = age - 1;
        }
        System.out.println("age = " + age);

//        solucion A.G
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
//        String fechaStr = scanner.next();
//
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        Date fechaNacimiento = df.parse(fechaStr);
//        Date actual = new Date();
//
//        // creamos un patron de fecha numérico con el año mes y día
//        df = new SimpleDateFormat("yyyyMMdd");
//
//        // luego convertimos ambas fechas la actual y la fecha de nacimiento
//        // en enteros que contiene el año mes y día
//        int desde = Integer.parseInt(df.format(fechaNacimiento));
//        int hasta = Integer.parseInt(df.format(actual));
//
//        // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
//        // dejar la fecha en decenas o centenas
//        int edad = (hasta - desde) / 10000;
//        System.out.println("La edad es: " + edad);



//        Date fechaAct=new Date();
//        Scanner in=new Scanner(System.in);
//        String fecha, formato="dd/MM/yyyy";
//        Date nacimiento=new Date();
//        SimpleDateFormat sdf=new SimpleDateFormat(formato);
//        System.out.println("Introduzca fecha de nacimiento.");
//        fecha=in.next();
//        try {
//            nacimiento=sdf.parse(fecha);
//        } catch (ParseException e) {
//            System.out.println("Ha habido algún problema, el formato válido es: "+formato);
//        }
//        long diferenciaEnMilisegundos = fechaAct.getTime() - nacimiento.getTime();
//        long edadEnAnios = TimeUnit.MILLISECONDS.toDays(diferenciaEnMilisegundos) / 365;
//        System.out.println("la edad es de : "+edadEnAnios);

    }
}
