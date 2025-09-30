package Negocio;

public class LeverDown implements iMachine {

    private final GumBallMachine machine;

    // Construtor que recebe a máquina
    public LeverDown(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public iMachine putCoin() {
        System.out.println("Moeda rejeitada, há uma goma saindo primeiro.");
        return this;
    }

    @Override
    public iMachine pullLever() {
        System.out.println("Já acionou a alavanca.");
        return this;
    }

    @Override
    public iMachine deliverGum() {
            System.out.println("Chiclete entregue!!!");
            machine.setBalls(machine.getBalls() - 1);        
            if(machine.getBalls() == 0) {
                System.out.println("Não há mais gomas, peça para um funcionário recarregar a máquina.");
                return new NoGum(machine);  
            }
            return new NoCoin(machine);  
         
    }

    @Override
    public iMachine rechargeGums(int newGums) {
        System.out.println("A máquina ainda possui chicletes à venda.");
        return this;
    }
}
