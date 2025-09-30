package apresentacao;

import java.util.ArrayList;
import java.util.HashMap;

import negocio.CardapioCarnivoroIterator;
import negocio.CardapioSobremesasIterator;
import negocio.CardapioVegetarianoIterator;
import negocio.IteratorDoIgor;
import negocio.MenuItem;

public class Main1 {

    public static void main(String[] args) {
        //CARDAPIO VEG
        ArrayList<MenuItem> cardapioVegetariano = new ArrayList<>();
        MenuItem pratoAnaClara = new MenuItem();
        pratoAnaClara.setDescricao("hamburguer de grão de bico");
        pratoAnaClara.setPreco(27);
        pratoAnaClara.setEhVegetariano(true);
        pratoAnaClara.setNome("hamburger a la ana clara");

        cardapioVegetariano.add(pratoAnaClara);
        CardapioVegetarianoIterator iteratorVegetariano = new CardapioVegetarianoIterator(cardapioVegetariano);
        printIterator(iteratorVegetariano);


        //CARDAPIO CARNIVORO
        MenuItem cardapioCarnivoro[] = new MenuItem[10];
        MenuItem brunoBife = new MenuItem();
        brunoBife.setDescricao("carne bem preparada (mal passada)");
        brunoBife.setNome("bife ala minuta do bruno");
        brunoBife.setEhVegetariano(false);
        brunoBife.setPreco(10);

        cardapioCarnivoro[0] = brunoBife;
        CardapioCarnivoroIterator iteratorCarnivoro = new CardapioCarnivoroIterator(cardapioCarnivoro);
        printIterator(iteratorCarnivoro);

        //CARDAPIO SOBREMESAS
        HashMap<String, MenuItem> cardapioSobremesas = new HashMap<>();
        MenuItem narizEntupido = new MenuItem();
        narizEntupido.setDescricao("Nariz entupido de creme ou doce de leite");
        narizEntupido.setNome("Nariz Entupido");
        narizEntupido.setEhVegetariano(true);
        narizEntupido.setPreco(12.00);

        cardapioSobremesas.put("Nariz Entupido", narizEntupido);
        CardapioSobremesasIterator iteratorSobremesas = new CardapioSobremesasIterator(cardapioSobremesas);
        printIterator(iteratorSobremesas);

    }

    private static void printIterator(IteratorDoIgor iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
