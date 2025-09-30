package negocio;

public class Label extends HtmlDecorator {

    private String label;
    private String name;
    private String placeholder;

    public Label(Arquivo arquivo,String label) {
        super(arquivo);
        this.label = label;
        this.content = "<label>" + label + "</label>";
    }
}
