package negocio;

import java.io.FileWriter;
import java.io.IOException;

public class HtmlWriter {

    public static void writeToFile(String content, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
