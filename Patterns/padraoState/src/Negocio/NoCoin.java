package Negocio;


public class NoCoin implements iMachine {
    private final GumBallMachine machine;

    public NoCoin(GumBallMachine machine) {
        this.machine = machine;
    }


    @Override
    public iMachine putCoin() {
        System.out.println("Moeda inserida.");
        return new HaveCoin(machine);
    }

    @Override
    public iMachine pullLever() {
        System.out.println("Coloque uma moeda");
        return this;
    }

    @Override
    public iMachine deliverGum() {
        System.out.println("Primeiro, pague...");
        return this;
    }

    @Override
    public iMachine rechargeGums(int newGums) {
        System.out.println("A maquina ainda possui chicletes a venda.");
        return this;
    }

    
    
}
