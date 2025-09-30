package negocio;

public class Form extends HtmlDecorator {

    private String action;
    private String method;

    public Form(Arquivo html, String action, String method) {
        super(html);
        this.action = action;
        this.method = method;
        this.content = "";
    }

    @Override
    public String build() {
        return html.build().replace(
                "<body>",
                "<body>\n<form action=\"" + action + "\" method=\"" + method + "\">\n"
        ).replace(
                "</body>",
                "</form>\n</body>"
        );
    }
}
