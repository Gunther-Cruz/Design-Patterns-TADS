package negocio;

public class InputTel extends HtmlDecorator {

    private String name;
    private String placeholder;

    public InputTel(Arquivo arquivo, String name, String placeholder) {
        super(arquivo);
        this.name = name;
        this.placeholder = placeholder;
        this.content ="<input type=\"tel\" name=\"" + name + "\" placeholder=\"" + placeholder + "\"><br>\n";
    }
}
