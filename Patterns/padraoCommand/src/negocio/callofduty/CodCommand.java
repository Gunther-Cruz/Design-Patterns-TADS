package negocio.callofduty;

import negocio.iJoystick;

public class CodCommand implements iJoystick {

    @Override
    public void executeA() {
        System.out.println("PA PA PA PA PA PA PA PA PA PA PA PA PA!!!");
    }

    @Override
    public void executeB() {
        System.out.println("RECARREGANDOOOOOOO");

    }

    @Override
    public void executeC() {
        System.out.println("*TROCA DE ARMA*");

    }

    @Override
    public void executeD() {
        System.out.println("GRANADAAA....................BOOOOOMMM!!!");

    }
}
