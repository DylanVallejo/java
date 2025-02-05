import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClientTest {

    public static void main(String[] args) {
        try {
            // URL del endpoint al que se enviará la solicitud POST
            URL url = new URL("https://example.com/api/resource");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Configuración de la solicitud
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            // Cuerpo de la solicitud
            String jsonInputString = "{\"name\": \"John\", \"age\": 30}";

            // Enviar la solicitud
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Leer la respuesta
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
