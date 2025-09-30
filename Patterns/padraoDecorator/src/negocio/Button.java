package negocio;

public class Button extends HtmlDecorator {

    private String buttonText;

    public Button(Arquivo html, String buttonText) {
        super(html);
        this.buttonText = buttonText;
        this.content = "<button type=\"submit\">" + buttonText + "</button>\n";
    }
}
