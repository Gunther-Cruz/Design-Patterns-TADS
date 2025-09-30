package resources;

public class Buyer implements iBuyer {
    
    protected String name;
    
    public Buyer(String name){
        this.name = name; 
    }  


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public void receiveNotification(String string) {
        System.out.println("para " + this.getName());
        System.out.println(string);
    }

    @Override
    public void receiveFinalNotification(double highestBid, Buyer highestBidder) {
        System.out.println("para " + this.getName());
        System.out.println("Dole uma, dole duas...VENDIDO!!! Para " + highestBidder.getName() + ", por um total de R$" + highestBid+"0.\n");
    }   

    
   
}
