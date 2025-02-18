package arreglos;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Enquiri {

    public static void main(String[] args) {

        Map<String, String> criterias = new LinkedHashMap<>();
        criterias.put("nombre", "Juan");
        criterias.put("apellido", "Fernandez");
        criterias.put("direccion", "Calle falsa 123");


        for (Map.Entry<String, String> entry : criterias.entrySet()) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }

    }

}
