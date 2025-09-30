package negocio;

// classe de Pedido

import java.util.ArrayList;

public class Pedido {

    @SuppressWarnings("unused")
    private int id;                
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Item> items;

    public Pedido(int id, Cliente cliente, Vendedor vendedor, ArrayList<Item> items) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.items = items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", cliente=" + cliente + ", vendedor=" + vendedor + ", items=" + items + "]";
    }

    
}
