package negocio;

public class Link extends HtmlDecorator {

    private String href;
    private String linkText;

    public Link(Arquivo html, String linkText, String href) {
        super(html);
        this.linkText = linkText;
        this.href = href;
        this.content = "<a href=\"" + href + "\">" + linkText + "</a>";
    }
}
