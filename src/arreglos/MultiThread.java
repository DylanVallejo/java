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
        headers.put("PRODUCTO", "");
        headers.put("INSTRUMENTO", "");
        headers.put("COBRO", "");
        headers.put("OPERACION", "");
        headers.put("MONEDA", "");
        headers.put("MONTO", "");
        headers.put("VAR", "");
        headers.put("BASE", "");
        headers.put("LIMITE", "");
        headers.put("MOVIMIENTO", "");
        headers.put("COMENTARIO", "");

        return headers;
    }


    private static void writeHeaderIfNotExists(String path) {
        File file = new File(path);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            List<String> headerColumns = Arrays.asList(
                    "PRODUCTO", "INSTRUMENTO", "COBRO", "OPERACION", "MONEDA",
                    "MONTO", "VAR", "BASE", "LIMITE", "MOVIMIENTO", "COMENTARIO"
            );

            String headerLine = String.join("|", headerColumns) + "\n";
            writer.write(headerLine);
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir las cabeceras", e);
        }
    }

    private static LinkedHashMap<String, String> processRecord(String id) {
        LinkedHashMap<String, String> recordData = initializeHeaders();

        recordData.put("PRODUCTO", id);
        recordData.put("INSTRUMENTO", "test" + id);
        recordData.put("COBRO", "test" + id);
        recordData.put("OPERACION", "test" + id);
        recordData.put("MONEDA", "test" + id);
        recordData.put("MONTO", "test" + id);
        recordData.put("VAR", "test" + id);
        recordData.put("BASE", "test" + id);
        recordData.put("LIMITE", "test" + id);
        recordData.put("MOVIMIENTO", "test" + id);
        recordData.put("COMENTARIO", "test" + id);
        System.out.println(" ------------------------  CURRENT RECORD ------------------------------------------- ");
        return recordData;
    }

}