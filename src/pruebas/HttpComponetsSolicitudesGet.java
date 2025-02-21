package pruebas;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpComponetsSolicitudesGet {

    public static void main(String[] args) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // URL del endpoint al que se enviará la solicitud GET
            HttpGet request = new HttpGet("https://pokeapi.co/api/v2/pokemon/ditto");
            request.addHeader("Accept", "application/json");

            // Ejecutar la solicitud
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                System.out.println("Response Code: " + response.getStatusLine().getStatusCode());

                // Leer la respuesta
                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println("Response: " + responseBody);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
