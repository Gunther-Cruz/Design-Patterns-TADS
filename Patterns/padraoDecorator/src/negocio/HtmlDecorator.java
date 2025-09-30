package negocio;

public abstract class HtmlDecorator extends Arquivo {

    protected Arquivo html;
    protected String content;

    public HtmlDecorator(Arquivo html) {
        this.html = html;
        this.content = "";
    }

    @Override
    public String build() {
        String baseHtml = html.build();
        return baseHtml.replace("</body>", this.content + "\n</body>");
    }

    @Override
    public Arquivo removeElement() {
        return html;
    }
}
