package negocio;

import java.util.ArrayList;

public class PedidoBuilder {

    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Item> items = new ArrayList<>();

    public PedidoBuilder id(int id) {
        this.id = id;
        return this;
    }

    public PedidoBuilder cliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public PedidoBuilder vendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public PedidoBuilder item(Item item) {
        this.items.add(item);
        return this;
    }

    public PedidoBuilder items(ArrayList<Item> items) {
        this.items = items;
        return this;
    }

    public Pedido build() {
        return new Pedido(id, cliente, vendedor, items);
    }
}
