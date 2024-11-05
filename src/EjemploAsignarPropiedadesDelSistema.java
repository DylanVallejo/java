import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDelSistema {

    public static void main(String[] args) {

        try{
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties prop = new Properties(System.getProperties());
            prop.load(archivo);
            prop.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");
            System.setProperties(prop);
            Properties ps = System.getProperties();

            System.out.println("ps.getProperty() = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));

        } catch (Exception e){
            System.err.println("No existe el archivo = " + e);
            System.exit(-1);
        }

    }
}
