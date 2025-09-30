package resources;

public interface iBuyer {
    public void receiveNotification(String string);
    
    public void receiveFinalNotification(double highestBid, Buyer highestBidder);
    
    //public void subscribe(Observer observer, Leiloeiro leiloeir);
    //public void unscribe(Observer observer, Leiloeiro leiloeiro);
}
