package bases;

import javax.swing.*;
import java.util.Objects;


public class ObtenerElNombreMasLargo {
    public static void main(String[] args) {

        System.out.println("**** Obten el nombre mas largo entre tres personas **** \n");

        String personaUno = JOptionPane.showInputDialog("Ingrese el nombre y apellido de la primera persona : ");
        if (Objects.equals(personaUno, null)){
            System.out.println("adios!!");
            System.exit(0);
        }
        // la expresion \\s reemplazara tod0 tipo de espacio en blanco como tabs o espacios.
        int personaUnolongitud = personaUno.replaceAll("\\s", "").length();
        System.out.println("personaUno = " + personaUno);

        String personaDos = JOptionPane.showInputDialog("Ingrese el nombre y apellido de la segunda persona: ");
        int personaDoslongitud = personaDos.replaceAll("\\s", "").length();
        System.out.println("personaDos = " + personaDos);

        String personaTres = JOptionPane.showInputDialog("Ingrese el nombre y apellido de la tercera persona: ");
        int personaTreslongitud = personaTres.replaceAll("\\s", "").length();
        System.out.println("personaTres = " + personaTres);

        if (personaUnolongitud > personaDoslongitud && personaUnolongitud > personaTreslongitud){
            System.out.println("La persona con el nombre mas largo es : "  + personaUno + "con una longitud de " + personaUnolongitud + " caracteres.");
        } else if (personaDoslongitud > personaUnolongitud && personaDoslongitud > personaTreslongitud) {
            System.out.println("La persona con el nombre mas largo es : "  + personaDos + "con una longitud de " + personaDoslongitud + " caracteres.");
        }else {
            System.out.println("La persona con el nombre mas largo es : "  + personaTres + "con una longitud de " + personaTreslongitud + " caracteres.");
        }

        main(args);

    }
}
