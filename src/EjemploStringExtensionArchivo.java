public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.xml";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length(0) = " + archivo.substring(i+1));

    }
}
