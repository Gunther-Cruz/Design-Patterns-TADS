package negocio;

public class InputEmail extends HtmlDecorator {

    private String name;
    private String placeholder;

    public InputEmail(Arquivo arquivo, String name, String placeholder) {
        super(arquivo);
        this.name = name;
        this.placeholder = placeholder;
        this.content = "<input type=\"email\" name=\"" + name + "\" placeholder=\"" + placeholder + "\"><br>\n";
    }
}
