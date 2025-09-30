import java.time.LocalDate;
import negocio.*;

public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro(2020, "Sadero", "Renault", "PPP-888", "0215a0ds12a");


        CarroProxy proxyCarro = new CarroProxy(carro1);


        Empregado empregado1 = new Empregado("Igor", LocalDate.of(2000, 6, 15), "123456789");
        Empregado empregado2 = new Empregado("Joao", LocalDate.of(1987, 5, 10), "");
        Empregado empregado3 = new Empregado("Gunther", LocalDate.of(1999, 8, 23), "0123423564");
        Empregado empregado4 = new Empregado("Marcio", LocalDate.of(2005, 7, 30), "");

        proxyCarro.manobrar(empregado1); 
        proxyCarro.manobrar(empregado2); 
        proxyCarro.manobrar(empregado3);
        proxyCarro.manobrar(empregado4);
    }
}
