package bases;

import javax.swing.*;
import java.util.Objects;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"Dylan", "Jonathan", "Andres", "Midu", "Moures", "Fatz"};
        int longitud = nombres.length;
        System.out.println("longitud = " + longitud);
        for (int i = 0; i < nombres.length; i ++){
            if (nombres[i].equalsIgnoreCase("Dylan") || nombres[i].equalsIgnoreCase("andres")){
//                contuinue le da la indicacion a la iteracion de continuar el flujo del if es decir
//                no imprimira Dylan ni Andres
                continue;
            }
            System.out.println(i +".- " + nombres[i]);
        }
        String buscar = JOptionPane.showInputDialog("ingrese un nombre : ");
        System.out.println("buscar = " + buscar);
        boolean encontrado = false;
        if (Objects.equals(buscar ,null)){
            System.out.println("Adios!!");
            System.exit(0);
        }
        for (int i = 0 ; i < nombres.length; i ++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println(i +".- " + nombres[i]);
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        }else{

            JOptionPane.showMessageDialog(null, buscar + " no fue encontrado.");
        }
        main(args);

    }
}
