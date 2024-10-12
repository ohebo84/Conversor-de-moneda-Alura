import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorJson {
    /*public void guardarJson(Monedas monedas) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(monedas + ".json");
        escritura.write(gson.toJson(monedas));
        escritura.close();
    }*/

    public void guardarJson(Monedas moneda) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Usamos el código de la moneda para el nombre del archivo
        try (FileWriter escritura = new FileWriter(moneda.target_code() + ".json")) {
            escritura.write(gson.toJson(moneda));
            System.out.println("Archivo guardado exitosamente: " + moneda.target_code() + ".json");
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
            throw e; // Relanzamos la excepción
        }
    }
}
