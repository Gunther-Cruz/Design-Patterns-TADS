package negocio;

import java.util.List;

public class JSONconverter extends CSVconverter{
    
    @Override
    protected String transformStringCSV(List<String[]> stringCSV) {
        StringBuilder json = new StringBuilder();
        json.append("[\n");

        String[] headers = stringCSV.get(0); 

        for (int i = 1; i < stringCSV.size(); i++) {
            json.append("  {\n");
            for (int j = 0; j < headers.length; j++) {
                json.append("    \"").append(headers[j]).append("\": \"").append(stringCSV.get(i)[j]).append("\"");

                if (j < headers.length - 1) {
                    json.append(",");
                }
                json.append("\n");

            }

            json.append("  }");

            if (i < stringCSV.size() - 1) {
                json.append(",");
            }
            
            json.append("\n");
        }

        json.append("]");

        return json.toString();
    }
    
}
