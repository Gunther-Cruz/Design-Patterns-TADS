package main;

import resources.Auctioneer;
import resources.Buyer;

public class App {
    public static void main(String[] args){

        
        Buyer henrique = new Buyer("Henrique");
        Buyer gabriel = new Buyer("Gabriel");
        Buyer joao = new Buyer("Joao");
        Buyer gunther = new Buyer("Gunther");
        
        Auctioneer igor = new Auctioneer();

        igor.subscribe(henrique);
        igor.subscribe(gunther);
        igor.subscribe(gabriel);

       igor.receiveBid(gunther, 100);
       igor.receiveBid(henrique, 96.00);

       igor.receiveBid(henrique, 101.00); //torna-se o lance mais alto

       igor.receiveBid(gabriel, 105.00);// substitui o lance por um mais mais alto


        igor.receiveBid(joao, 120.00);//erro por nao estar escrito
        igor.subscribe(joao);
        igor.receiveBid(joao, 155.00);// substitui o lance por um mais mais alto
        igor.receiveBid(gunther, 200);

        igor.unscribe(henrique);
        igor.receiveBid(henrique, 2500);
        
        
        igor.hitGavel();
        //igor.unscribe(joao);
        //igor.unscribe(gabriel);
        //igor.unscribe(gunther);

    }
}
