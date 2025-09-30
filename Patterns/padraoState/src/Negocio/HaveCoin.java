package Negocio;


public class HaveCoin implements iMachine {

    private final GumBallMachine machine;

    public HaveCoin(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public iMachine putCoin() {
        System.out.println("ja tem moeda, puxe a alavanca");
        return this;
    }

    @Override
    public iMachine pullLever() {
        System.out.println("Alavanca acionada");
        return new LeverDown(machine);
    }

    @Override
    public iMachine deliverGum() {
        System.out.println("Acione a alavanca");
        return this;
    }

    @Override
    public iMachine rechargeGums(int newGums) {
        System.out.println("A maquina ainda possui chicletes a venda.");
        return this;
    }

}
