/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class CardapioVegetarianoIterator implements IteratorDoIgor {

    private ArrayList<MenuItem> cardapio;
    private int pos;
    
    public CardapioVegetarianoIterator(ArrayList<MenuItem> cardapio){
        this.cardapio = cardapio;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return this.pos < this.cardapio.size();
    }

    @Override
    public MenuItem next() {
        if (this.hasNext()){
            MenuItem item = this.cardapio.get(pos);
            pos++;
            return item;
        }
        return null;
    }
    
}
