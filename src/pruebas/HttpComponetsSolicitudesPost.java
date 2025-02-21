package pruebas;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.nio.charset.StandardCharsets;

public class HttpComponetsSolicitudesPost {

    public static void main(String[] args) {
        String url = "http://localhost:3000/persona";
        String jsonBody = "{\"name\": \"Alice\", \"age\": 25}";  // JSON a enviar

        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost post = new HttpPost(url);
            post.setHeader("Content-Type", "application/json");  // Indicamos JSON como tipo de contenido
            post.setEntity(new StringEntity(jsonBody, StandardCharsets.UTF_8));  // Adjuntamos el JSON

            // Ejecutamos la solicitud
            try (CloseableHttpResponse response = client.execute(post)) {
                System.out.println("Código de respuesta: " + response.getStatusLine().getStatusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}