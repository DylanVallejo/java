package arreglos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MultiThread {

    static String PATH = "C:\\textos\\multi-thread.txt";
    public static void main(String[] args) { // TODO GET IDS
        String[] ids = {"ID1", "ID2", "ID3", "ID4", "ID-6"};
        processIds(ids);
        writeHeaderIfNotExists(PATH);

    }


    public static void processIds(String[] ids) {

//TODO INTERNAMENTE ITERA Y MANDA UNO POR UNO
        for (String id : ids) {
            new Thread(() -> processId(id)).start(); //TODO CREA UN HILO POr RID
        }
    }

    public static void processId(String id) { //TODO SIMULA  POST UPDATE REQUEST
        StringBuilder fetchedData = new StringBuilder();
        LinkedHashMap<String, String> recordData = processRecord(id);
        writeValuesLine(recordData,fetchedData);
        System.out.println("Processing ID: " + id);
        writeIdToFile(id, fetchedData);
    }

    private static void writeValuesLine(LinkedHashMap<String, String> map, StringBuilder finalResult) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            finalResult.append(entry.getValue()).append("|");
        }
        finalResult.append("\n");
    }

    public static void writeIdToFile(String id, StringBuilder finalResult) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, true))) {
            writer.write(finalResult.toString());
//            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static LinkedHashMap<String, String> initializeHeaders() {
        LinkedHashMap<String, String> headers = new LinkedHashMap<>();
        headers.put("CODIGO_PRODUCTO", "");
        headers.put("TIPO_INSTRUMENTO", "");
        headers.put("PERIODICIDAD_COBRO", "");
        headers.put("OPERACION_LIBRE", "");
        headers.put("MONEDA", "");
        headers.put("MONTO_FIJO", "");
        headers.put("MONTO_VAR", "");
        headers.put("BASE_COBRO", "");
        headers.put("LIMITE_MAX", "");
        headers.put("TIPO_MOVIMIENTO", "");
        headers.put("COMENTARIO", "");

        return headers;
    }


    private static void writeHeaderIfNotExists(String path) {
        File file = new File(path);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            List<String> headerColumns = Arrays.asList(
                    "CODIGO_PRODUCTO", "TIPO_INSTRUMENTO", "PERIODICIDAD_COBRO", "OPERACION_LIBRE", "MONEDA",
                    "MONTO_FIJO", "MONTO_VAR", "BASE_COBRO", "LIMITE_MAX", "TIPO_MOVIMIENTO", "COMENTARIO"
            );

            String headerLine = String.join("|", headerColumns) + "\n";
            writer.write(headerLine);
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir las cabeceras", e);
        }
    }

    private static LinkedHashMap<String, String> processRecord(String id) {
        LinkedHashMap<String, String> recordData = initializeHeaders();

        recordData.put("CODIGO_PRODUCTO", id);
        recordData.put("TIPO_INSTRUMENTO", "test" + id);
        recordData.put("PERIODICIDAD_COBRO", "test" + id);
        recordData.put("OPERACION_LIBRE", "test" + id);
        recordData.put("MONEDA", "test" + id);
        recordData.put("MONTO_FIJO", "test" + id);
        recordData.put("MONTO_VAR", "test" + id);
        recordData.put("BASE_COBRO", "test" + id);
        recordData.put("LIMITE_MAX", "test" + id);
        recordData.put("TIPO_MOVIMIENTO", "test" + id);
        recordData.put("COMENTARIO", "test" + id);
        System.out.println(" ------------------------- currentEbReco  ------------------------------------------- ");
        return recordData;
    }

}