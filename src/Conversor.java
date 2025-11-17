import com.google.gson.Gson;

public class Conversor {

    public static double converter(String de, String para, double valor) {

        String json = ApiClient.buscarCotacao(de);

        ApiResponse resposta = new Gson().fromJson(json, ApiResponse.class);

        double taxa = resposta.conversion_rates.get(para);

        return valor * taxa;
    }
}
