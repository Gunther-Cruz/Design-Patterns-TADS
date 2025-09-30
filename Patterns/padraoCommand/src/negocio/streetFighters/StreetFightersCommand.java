package negocio.streetFighters;

import negocio.iJoystick;

public class StreetFightersCommand implements iJoystick{

    @Override
    public void executeA() {
        System.out.println("Chute ALTO");
    }

    @Override
    public void executeB() {
        System.out.println("Chute BAIXO");
    }

    @Override
    public void executeC() {
        System.out.println("Soco FRACO");
    }

    @Override
    public void executeD() {
        System.out.println("Soco PESADO");        
    }

    
}
