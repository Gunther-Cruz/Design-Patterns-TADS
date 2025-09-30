package resources;


public interface iAuctioneer {
    public void subscribe(iBuyer observer);

    
    public void unscribe(iBuyer observer);
    
    public void notification();
}
