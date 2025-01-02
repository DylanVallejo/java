package bases;

import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas =  new double[20];

        double sumaNotasMayoresACinco = 0;
        int notas5 =0;
        double sumaNotasMenoresCuatro = 0;
        int notas4= 0;
        double numeroDeNotasUno = 0;
        double sumaTotal = 0;

        for (int i = 0; i < notas.length; i++){
            int numeroDeNota = i+1;
            System.out.println("Inserte la nota número: " + numeroDeNota+ " del alumno con decimales 7.0 .");
            double notaIngresa = scanner.nextDouble();
            if (notaIngresa == 0){
                System.out.println("Error finalizando el programa");
                break;
            }else if ( notaIngresa > 7 || notaIngresa < 0 ){
                System.out.println("Unicamente deben ser notas con rango de 1 a 7!!!!  \n Inserte la nota número: " + numeroDeNota + " del alumno con decimales 7.0 .");
                notaIngresa = scanner.nextDouble();
                notas[i] =  notaIngresa;
            }else {
                notas[i] = notaIngresa;
            }
        }

        for (double nota : notas) {
            sumaTotal += nota;
            if (nota == 1.0) {
                numeroDeNotasUno += 1;
            }
            if (nota > 5) {
                notas5 += 1;
                sumaNotasMayoresACinco += nota;
            }
             if (nota < 4) {
                notas4 += 1;
                sumaNotasMenoresCuatro += nota;
            }
        }
        System.out.println(" Promedio de notas mayores a 5 = " + sumaNotasMayoresACinco / notas5 );
        System.out.println(" Promedio de notas menores a 4 = " + sumaNotasMenoresCuatro / notas4);
        System.out.println(" Cantidad de notas con Uno = " + numeroDeNotasUno );
        System.out.println(" Promedio total = " + sumaTotal / notas.length );
    }
}

