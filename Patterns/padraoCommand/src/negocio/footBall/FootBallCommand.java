package negocio.footBall;

import negocio.iJoystick;

public class FootBallCommand implements iJoystick {

    @Override
    public void executeA() {
        System.out.println("Chuta a bola");
    }

    @Override
    public void executeB() {
        System.out.println("Cruza a bola");
    }

    @Override
    public void executeC() {
        System.out.println("Chute falso");
    }

    @Override
    public void executeD() {
        System.out.println("Passa a bola");
    }

   
}
