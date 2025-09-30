package negocio;

import java.util.List;

public class TXTconverter extends CSVconverter {

    @Override
    protected String transformStringCSV(List<String[]> stringCSV) {

        StringBuilder txt = new StringBuilder();
        txt.append("Lista de usuarios\n");
        for (String[] row : stringCSV) {
            for (String cell : row) {
                txt.append(cell).append(" | ");
            }
            txt.append("\n");
        }
        return txt.toString();
    }
}
    

