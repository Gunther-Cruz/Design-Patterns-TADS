package Negocio;

public class GumBallMachine {
    
    private int balls;
    private iMachine state;
    //int selledGums = 0;
    
    public GumBallMachine(int balls) {
        this.state = new NoCoin(this);
        this.balls = balls;
        this.balls = balls;
    }

    public void receiveCoin() {
        this.state = this.state.putCoin();
    }

    public void leverDown() {
        this.state = this.state.pullLever(); 
    }

    
    public void deliverGum() {
        this.state = this.state.deliverGum();
    }
    
    public void rechargeMachine(int newGums){
        this.state = this.state.rechargeGums(newGums);
    }
    
    public int getBalls() {
        return balls;
    }
    
    public void setBalls(int balls) {
        this.balls = balls;
    }
    
    @Override
    public String toString() {
        return "GumBallMachine [balls = " + balls;
    }
}
