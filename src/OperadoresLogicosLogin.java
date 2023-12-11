import java.sql.Struct;
import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String userName = "Dylan";
        String password = "TRYAGAIN";

        String userName2 = "Joel";
        String password2 = "TRYAGAIN2";

//        instanciando un array de string
//        String[] users = new String[2];
//        String[] passwords = new String[2];

//        users[0] = "Dylan";
//        passwords[0] = "TRYAGAIN";
//
//
//        users[1] = "Joel";
//        passwords[1] = "TRYAGAIN2";

//        ESTA TAMBIEN ES UNA FORMA DE INICIALIZAR ARREGLOS

        String[] users = { "Dylan", "Joel"};

        String[] passwords ={ "TRYAGAIN", "TRYAGAIN2"};

        while(true) {
            System.out.println("sistema de login porfavor ingrese su usuario o "+ "'cancelar'"+  " para cerrar el programa" );
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese su userName: ");

            String user = scanner.next();


            if ( user.equalsIgnoreCase("cancelar") ){
                break;
            }

            System.out.println("ingrese el password : ");
            String p = scanner.next();

            boolean login = false;

            for (int i = 0; i < users.length; i++){
                if (users[i].equals(user) && passwords[i].equals(p)) {
                    login = true;
                    break;
                }
            }

            if(login){
                System.out.println("Bienvenido ".concat(user).concat("!"));
            } else {
                System.out.println("passwordo o usuario erroneo intente de nuevo ");
            }
        }
    }
}
