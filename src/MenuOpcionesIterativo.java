import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MenuOpcionesIterativo {
    public static void main(String[] args){

        int opcionIndice = 0;
        boolean continuar = true;

        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArray = opciones.keySet().toArray();

        while(continuar){
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleecione una opcion",
                    "Manenedor de productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArray, opArray[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());
                System.out.println("opcionIndice = " + opcionIndice);
                switch (opcionIndice) {
                    case 1:
                        System.out.println("Usuario actualizado correctamente.");
                        break;
                    case 2:
                        System.out.println("Usuario eliminado correctamente.");
                        break;
                    case 3:
                        System.out.println("Usuario agregado correctamente.");
                        break;
                    case 4:
                        System.out.println("Listando usuarios.");
                        break;
                    case 5:
                        System.out.println("Has salido con éxito!!");
                        continuar = false;
                        break;
                }
            }
        }
    }
}
