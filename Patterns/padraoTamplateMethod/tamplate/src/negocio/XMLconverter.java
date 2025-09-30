package negocio;

import java.util.List;

public class XMLconverter extends CSVconverter {

    @Override
    protected String transformStringCSV(List<String[]> stringCSV) {
        StringBuilder xml = new StringBuilder();
        xml.append("<data>\n");


        for (int i = 1; i < stringCSV.size(); i++) {
            xml.append("  <record>\n");

            String[] header = stringCSV.get(0);
            for (int j = 0; j < stringCSV.get(i).length; j++) {
                xml.append("    <").append(header[j]).append(">").append(stringCSV.get(i)[j]).append("</").append(header[j]).append(">\n");
            }
            xml.append("  </record>\n");
        }
        xml.append("</data>");
        return xml.toString();

    }

}
