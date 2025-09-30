import negocio.*;

public class App {
    public static void main(String[] args) throws Exception {
        Arquivo html = new HtmlBase("Formulário de Cadastro");

        //cria formulario
        html = new Label(html, "Nome");
        html = new InputText(html, "nome", "Digite seu nome");

        html = new Label(html, "Telefone");
        html = new InputTel(html, "telefone", "Digite seu telefone");

        html = new Label(html, "CPF");
        html = new InputCpf(html, "cpf", "Digite seu CPF");

        html = new Label(html, "Email");
        html = new InputEmail(html, "email", "Digite seu email");

        html = new Button(html, "Enviar");
        html = new Form(html, "/submit", "post"); //form precisa estar após todos os inputs

        //colocando 3 imagens e retirando o ultmimo elemento
        html = new Image(html, "./meme1.jpg", "Linux Wins");
        html = new Image(html, "./meme2.jpg", "Do Rock");
        html = new Image(html, "./meme1.jpg", "Linux Wins");
        html = html.removeElement();

        html = new Link(html, "IFRS Campus Rio Grande", "https://ifrs.edu.br/riogrande/");
        html = new Button(html, "Enviar");

        HtmlWriter.writeToFile(html.build(), "index.html");

    }
}
