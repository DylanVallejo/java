import org.w3c.dom.ls.LSOutput;

public class HelloWorld {

    public static void main(String[] args) {

        String hello = "Hello World";
        System.out.println(hello);
        System.out.println("saludar = " + hello.toUpperCase());
        int numero = 24;
        System.out.println("numero = " + numero);

        boolean valor = true;
        if(valor){
            System.out.println("es verdadero");
            valor = false;
            if(!valor){
                System.out.println(
                    "cambio a falso"
                );
            }
        }

        // int personas = 5;


    }

}
