package negocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class CSVconverter {

    public final void converter(String csvFile, String convertedFile) throws FileNotFoundException, IOException {
        List<String[]> stringCSV = csvReader(csvFile);
        String transformed = transformStringCSV(stringCSV);
        writeFile(transformed, convertedFile);
    }

    private List<String[]> csvReader(String csvFile) throws FileNotFoundException, IOException {
        List<String[]> stringCSV = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = buffer.readLine()) != null) {
                String[] lines = line.split(",");
                stringCSV.add(lines);
            }
            return stringCSV;
        }
    }

    protected abstract String transformStringCSV(List<String[]> stringCSV);

    private void writeFile(String transdormed, String convertedFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(convertedFile))) {
            writer.write(transdormed);
        }
    }
}
