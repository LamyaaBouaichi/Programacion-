package llmservice;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;
import com.google.gson.*;

public class LlmService {

	String tipo;
	String franquicia;

	public LlmService() {

	}

	public String sugerirNombreProducto(String tipo, String franquicia) {

		Properties props = new Properties();

		String prompt = "";
		String resultado = "";
		String apiKey = "";

		try {
			props.load(new FileInputStream("config.properties"));
			apiKey = props.getProperty("OPENROUTER_API_KEY");

		} catch (IOException e) {
			System.out.println("No se ha podido leer el archivo de configuración");
		}

		prompt = "Sugiere solo un nombre llamativo y original para un producto otaku del tipo " + tipo
				+ " basado en la franquicia " + franquicia
				+ ", solo el nombre y no me expliques el por qué de dicho nombre y no me lo pongas entre comillas, que la respuesta tenga cómo máximo 25 caracteres";

		try {

			HttpClient client = HttpClient.newHttpClient();

			JsonObject message = new JsonObject();
			message.addProperty("role", "user");
			message.addProperty("content", prompt);

			JsonArray messages = new JsonArray();
			messages.add(message);

			JsonObject body = new JsonObject();
			body.addProperty("model", "mistralai/mistral-7b-instruct:free");
			body.add("messages", messages);

			HttpRequest request = HttpRequest.newBuilder()
					.uri(new URI("https://openrouter.ai/api/v1/chat/completions"))
					.header("Authorization", "Bearer " + apiKey)
					.header("Content-Type", "application/json")
					.POST(HttpRequest.BodyPublishers.ofString(body.toString()))
					.build();

			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			// Extraer el texto generado
			JsonObject json = JsonParser.parseString(response.body())
					.getAsJsonObject();resultado = json
					.getAsJsonArray("choices")
					.get(0).getAsJsonObject()
					.getAsJsonObject("message")
					.get("content").getAsString();

			System.out.println("Sugerencia:\n" + resultado);

		} catch (Exception e) {
			System.out.println("Error al comunicar con OpenRouter: " + e.getMessage());
		}

		return resultado;

	}

}
