package apresentacao;

import negocio.*;

public class App {
    public static void main(String[] args) throws Exception {
        String nameCSV = "teste.csv";

        CSVconverter htmlConverter = new HTMLconverter();
        CSVconverter xmlConverter = new XMLconverter();
        CSVconverter pdfConverter = new TXTconverter();
        CSVconverter jsonConverter = new JSONconverter();


        htmlConverter.converter(nameCSV, "index.html");
        xmlConverter.converter(nameCSV, "teste.xml");
        pdfConverter.converter(nameCSV, "teste.txt");
        jsonConverter.converter(nameCSV, "teste.json");




    }
}
