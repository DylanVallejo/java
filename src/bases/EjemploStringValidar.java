package bases;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("es Nulo = " + esNulo);


        if(esNulo){
            curso = "Programación con Java ";
        }

        boolean esVacio = curso.isEmpty();
        System.out.println("esVacio = " + esVacio);
        boolean esVacio2 = curso.isEmpty();

        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso de: ".concat(curso));
            System.out.println("Hello world " + curso);
        }


    }
}
