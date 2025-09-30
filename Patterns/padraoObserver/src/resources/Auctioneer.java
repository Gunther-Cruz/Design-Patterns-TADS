package resources;

import java.util.ArrayList;

public class Auctioneer implements iAuctioneer {

    private Buyer highestBidder;
    private double highestBid;
    protected ArrayList<iBuyer> vetBuyers;

    public Auctioneer() {
        this.vetBuyers = new ArrayList<>();
    }

    public Buyer getBidder() {
        return highestBidder;
    }
    public void setBidder(Buyer highestBidder) {
        this.highestBidder = highestBidder;
    }
    
    public double getBid() {
        return highestBid;
    }
    public void setBid(Buyer buyer, double bid) {
        this.highestBid = bid;
        this.highestBidder = buyer;
        this.notification();
    }
    
    public ArrayList<iBuyer> getVetBuyers() {
        return vetBuyers;
    }



    public void receiveBid(Buyer buyer, double bid) {
        if (this.getVetBuyers().contains(buyer)) {
            if (bid > this.getBid()) {
                this.setBid(buyer, bid);
            } else {
                buyer.receiveNotification("O valor de seulance é menor que o lance atual\n");
            }
        } else {
            buyer.receiveNotification("Voce nao esta participando desse Leilao\\n");
        }
    }

    
    
    public void hitGavel() {
        for (iBuyer buyer : vetBuyers) {
            buyer.receiveFinalNotification(highestBid, highestBidder);
        }
    }



    @Override
    public void subscribe(iBuyer buyer) {
        this.vetBuyers.add(buyer);
    }

    @Override
    public void unscribe(iBuyer buyer) {
        this.vetBuyers.remove(buyer);
    }

    @Override
    public void notification() {
        String notification = "R$ " + this.getBid() + "0 é o lance de " + highestBidder.getName() + ". Quem da mais?\n";
        for (iBuyer comprador : vetBuyers) {
            comprador.receiveNotification(notification);
        }
    }
}
