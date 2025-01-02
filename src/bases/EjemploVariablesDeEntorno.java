package bases;

import java.util.Map;

public class EjemploVariablesDeEntorno  {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variable de entorno = " + varEnv);

        System.out.println(" ----- Listando variables de entorno del sistema -----");

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome =  System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temp = System.getenv("TEMP");
        System.out.println("temp = " + temp);

        String path = varEnv.get("Path");
        System.out.println("path = " + path);

    }
}
