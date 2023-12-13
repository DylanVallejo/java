import java.util.Scanner;

public class SistemaEstanqueDeGasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("**** bienvenido al sistema de medida de gasolina **** \n inserte 0 para cerrar el programa");

        Double medida = 0.0;

        System.out.println(" porfavor ingresa la medida de tu estanque de gasolina ejem : 20.2 ");

        medida = s.nextDouble();
        if (medida.equals(0.0)){
            System.out.println("Hasta luego!!");
            System.exit(0);
        }

        if (medida > 70 || medida <= 0){
            System.out.println(" Medida fuera del rango ingrese una medida valida!!!");
        } else if( medida == 70 ){
            System.out.println("Estanque lleno!! la medida actual es  = " + medida);
        } else if (medida >= 60 && medida < 70){
            System.out.println("Estanque casi lleno!! la medida actual es  = " + medida);
        } else if (medida >= 40  && medida < 60){
            System.out.println("Estanque a 3/4 partes!! la medida actual es  = " + medida);            
        } else if (medida >= 35 && medida < 40) {
            System.out.println("Medio estanque !! la medida actual es  = " + medida);
        } else if (medida >= 20 && medida < 35) {
            System.out.println("Suficiente!! la medida actual es  = " + medida);
        } else if (medida >= 1 && medida < 20) {
            System.out.println("Estanque Insuficiente!! la medida actual es  = " + medida);
        }

        main(args);

    }
}
