package Apresentaçao;

import Negocio.GumBallMachine;

public class App {
    public static void main(String[] args) throws Exception {
        GumBallMachine machine = new GumBallMachine(2);

        machine.receiveCoin();
        machine.leverDown();
        machine.deliverGum();
        
        System.out.println(machine);

        machine.receiveCoin();
        machine.leverDown();
        machine.deliverGum();

        System.out.println(machine);

        machine.deliverGum();

        machine.rechargeMachine(10);
        System.out.println(machine);
        
    }
}
