package negocio;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CardapioSobremesasIterator implements IteratorDoIgor {

    private Iterator<Map.Entry<String, MenuItem>> iterator;

    public CardapioSobremesasIterator(HashMap<String, MenuItem> sobremesas) {
        this.iterator = sobremesas.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        if (hasNext()) {
            return iterator.next().getValue();
        }
        return null;
    }
}
