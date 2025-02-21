package pruebas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;

public class Solicitudes {

    public static void main(String[] args) {
        try {
            // URL del endpoint al que se enviará la solicitud POST
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/ditto");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Configuración de la solicitud
            connection.setRequestMethod("GET");
//            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
//            connection.setDoOutput(true);

            // Leer la respuesta
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Imprimir la respuesta
                System.out.println("Response: " + response.toString());
            } else {
                System.out.println("GET request failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
