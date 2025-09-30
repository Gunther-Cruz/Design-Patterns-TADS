package negocio;

public class Image extends HtmlDecorator {

    private String src;
    private String alt;

    public Image(Arquivo html, String src, String alt) {
        super(html);
        this.src = src;
        this.alt = alt;
        this.content = "<img src=\"" + src + "\" alt=\"" + alt + "\">";
    }
}
