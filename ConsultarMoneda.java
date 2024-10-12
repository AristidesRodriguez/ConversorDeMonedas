import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;

public class ConsultarMoneda {
    public Monedas buscarMoneda(String monedaBase, String monedaObjetivo) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/0c99fc254efed73be9db1bd4/pair/"+ monedaBase + "/" + monedaObjetivo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        //System.out.println(request);;;
        try {
            HttpResponse<String> responce =
                    client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(responce.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("Moneda no encontrada");
        }
    }
}

