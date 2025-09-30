package Negocio;

public class NoGum implements iMachine {

    private final GumBallMachine machine;
 
    public NoGum(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public iMachine putCoin() {
        System.out.println("Operaçao invalida! Por favor contate um funcionario para recarregar a maquina.");
        return this;
    }

    @Override
    public iMachine pullLever() {
        System.out.println("Operaçao invalida! Por favor contate um funcionario para recarregar a maquina.");
        return this;
    }

    @Override
    public iMachine deliverGum() {
        System.out.println("Operaçao invalida! Por favor contate um funcionario para recarregar a maquina.");
        return this;
    }

    @Override
    public iMachine rechargeGums(int newGums) {
        System.out.println("Maquina sendo recarregada");
        machine.setBalls(newGums);
        return new NoCoin(machine);
    }

   
    
}
