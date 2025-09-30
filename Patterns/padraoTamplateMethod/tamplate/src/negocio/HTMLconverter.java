package negocio;

import java.util.List;

public class HTMLconverter extends CSVconverter{

    
    
    @Override
    protected String transformStringCSV(List<String[]> stringCSV) {
        StringBuilder html = new StringBuilder();
        html.append("<html><body><table border='1'>\n");

        for (String[] row : stringCSV) {
            html.append("<tr>");
            for (String cell : row) {
                html.append("<td>").append(cell).append("</td>");
            }
            html.append("</tr>\n");
        }
        html.append("</table></body></html>");
        return html.toString();
    }
}
    

