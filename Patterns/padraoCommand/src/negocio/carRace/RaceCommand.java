package negocio.carRace;

import negocio.iJoystick;

public class RaceCommand implements iJoystick{

    @Override
    public void executeA() {
        System.out.println("ACELERANDO!!!");
    }

    @Override
    public void executeB() {
        System.out.println("FREIA PORRA");
    }

    @Override
    public void executeC() {
        System.out.println("DOBRA A DIREITA");
    }

    @Override
    public void executeD() {
        System.out.println("DOBRA A ESQUERDA");
    }
    
}
