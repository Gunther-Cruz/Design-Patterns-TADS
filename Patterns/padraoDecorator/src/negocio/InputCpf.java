package negocio;

public class InputCpf extends HtmlDecorator {

    private String name;
    private String placeholder;

    public InputCpf(Arquivo arquivo, String name, String placeholder) {
        super(arquivo);
        this.name = name;
        this.placeholder = placeholder;
        this.content = "<input type=\"text\" name=\"" + name + "\" placeholder=\"" + placeholder + "\"><br>\n";
    }
}
