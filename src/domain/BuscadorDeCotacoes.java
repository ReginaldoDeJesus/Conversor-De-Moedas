package domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscadorDeCotacoes {

    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public Cotacao bucarCotacoes(){
        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/3c06017ccaaa68ea98b05b6f/latest/USD"))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //System.out.println(response.body());
             Cotacao cotacao = new Gson().fromJson(response.body(), Cotacao.class);
             return cotacao;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
