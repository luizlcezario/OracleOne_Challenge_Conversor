package br.com.luizlcezario.me.converter.service;

import br.com.luizlcezario.me.converter.CoinName;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoinService {

    private Double getValueofCoinToReal(String key) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://economia.awesomeapi.com.br/"+ CoinName.getId(key) + "/1"))
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != HttpURLConnection.HTTP_OK){
                throw new Exception("Erro ao buscar dados");
            }
            String body = response.body().toString();
            Integer re = body.indexOf("ask");
            String ask = body.substring(re+6, re+10);
            if (ask.endsWith("\"")) {
                ask = ask.substring(0, ask.length() - 1);
            };
            return Double.parseDouble(ask);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return 0.0;
        }
    }


    public List<String> getAllCoinNam() {
        List<String> coinName = Stream.of(CoinName.values()).map(CoinName::getCoinName).collect(Collectors.toList());
        return coinName;
    }

    public Double convertionValue(String convert, String reciver, Double value) {
        Double convertValueinReal = getValueofCoinToReal(convert);
        Double reciverValueinReal = getValueofCoinToReal(reciver);
        return (convertValueinReal / reciverValueinReal) * value;
    }
}
