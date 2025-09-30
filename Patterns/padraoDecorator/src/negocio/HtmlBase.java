package negocio;

public class HtmlBase extends Arquivo {

    private String title;

    public HtmlBase(String title) {
        this.title = title;
    }

    @Override
    public String build() {
        return """
               <html>
               <head>
               <title>""" + title + "</title>\n</head>\n"
                + "<body>\n</body>\n"
                + "</html>";
    }
}
