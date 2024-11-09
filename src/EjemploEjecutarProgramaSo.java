import java.io.IOException;

public class EjemploEjecutarProgramaSo {

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process process;

        try {
            if(System.getProperty("os.name").toLowerCase().contains("windows")){
                process = rt.exec("notepad");
            } else if (System.getProperty("os.name").startsWith("Mac")) {
                process = rt.exec("textedit");
            } else if (System.getProperty("os.name").startsWith("nux")) {
                process = rt.exec("gedit");
            } else {
                process = rt.exec("gedit");
            }
            process.waitFor();
        }catch (Exception e){
            System.err.println("El comando es desconocido: "+ e.getMessage() );
            System.exit(1 );
        }
        System.out.println("se ha cerrado el editor" );
        System.exit(0);



    }
}
