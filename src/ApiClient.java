import java.net.http.*;
import java.net.URI;
import java.io.IOException;

public class ApiClient {

    private static final String API_KEY = "SUA_KEY_AQUI";

    public static String buscarCotacao(String moedaBase) {
        try {
            String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + moedaBase;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao conectar à API");
        }
    }
}
