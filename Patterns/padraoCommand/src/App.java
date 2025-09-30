import negocio.*;
import negocio.callofduty.CodCommand;
import negocio.carRace.RaceCommand;
import negocio.footBall.FootBallCommand;
import negocio.streetFighters.StreetFightersCommand;

public class App {
    public static void main(String[] args) throws Exception {
        Joystick joystick = new Joystick();

        System.out.println("____ PLAYSTATION 0.5 ____");

        System.out.println("Escolha seu jogo: ");
        System.out.println("(A) ==> Fifinha dos Guri");
        System.out.println("(B) ==> StreetF dos Guri");
        System.out.println("(C) ==> Forza 7 dos Guri");
        System.out.println("(D) ==> CODizin dos Guri");
        
        joystick.buttonD(1);//vai dizer que nao ha jogo

        //comandos para o fifinha
        joystick.setSlot(0, new FootBallCommand());
        joystick.buttonA(0);
        joystick.buttonB(0);
        joystick.buttonC(0);
        joystick.buttonD(0);
        System.out.println();

        //comandos para o Street
        joystick.setSlot(1, new StreetFightersCommand());
        joystick.buttonA(1);
        joystick.buttonB(1);
        joystick.buttonC(1);
        joystick.buttonD(1);
        System.out.println();

        //comandos para o Forza
        joystick.setSlot(2, new RaceCommand());
        joystick.buttonA(2);
        joystick.buttonB(2);
        joystick.buttonC(2);
        joystick.buttonD(2);
        System.out.println();

        //comandos para o COD
        joystick.setSlot(3, new CodCommand());
        joystick.buttonA(3);
        joystick.buttonB(3);
        joystick.buttonC(3);
        joystick.buttonD(3);
        System.out.println();        
    }
}
