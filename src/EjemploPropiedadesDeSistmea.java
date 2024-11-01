import javax.lang.model.element.NestingKind;
import java.util.Properties;

public class EjemploPropiedadesDeSistmea {
    public static void main(String[] args) {
        String userName = System.getProperty("user.name");
        System.out.println("Usuario: " + userName);

        String home = System.getProperty("user.home");
        System.out.println("Home : " + home);

        String workSpace = System.getProperty("user.dir");
        System.out.println("WorkSpace : " + workSpace);

        String java  = System.getProperty("java.version");
        System.out.println("Java version : " + java);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("LineSeparator : " + lineSeparator2 + " una linea nueva");


        Properties p = System.getProperties();
        p.list(System.out);


    }
}
