package negocio;

public class InputText extends HtmlDecorator {

    private String name;
    private String placeholder;

    public InputText(Arquivo arquivo, String name, String placeholder) {
        super(arquivo);
        this.name = name;
        this.placeholder = placeholder;
        this.content = "<input type=\"text\" name=\"" + name + "\" placeholder=\"" + placeholder + "\"><br>\n";
    }
}
