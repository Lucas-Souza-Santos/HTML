import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.util.stream.Collectors;

public class Principal
{
    public static void main(String[] args) throws IOException, InterruptedException {

        connectAndPrintUrlJavaOracle();
    }

    private static void connectAndPrintUrlJavaOracle() throws IOException, InterruptedException {
        // http request
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/")).build();

        HttpClient httpClient = HttpClient.newHttpClient();

        httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code: " + response.statusCode());
    }
}
