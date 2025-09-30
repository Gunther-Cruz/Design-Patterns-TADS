package negocio;

public class Joystick {

    private final iJoystick slots[];

    public Joystick() {
        this.slots = new iJoystick[4];
        for (int i = 0; i < this.slots.length; i++) {
            this.slots[i] = new NoGame();
        }
    }

    public void setSlot(int i, iJoystick command) {
        this.slots[i] = command;
    }

    public void buttonA(int i) { 
        this.slots[i].executeA();
    }

    public void buttonB(int i) {
        this.slots[i].executeB();
    }

    public void buttonC(int i) {
        this.slots[i].executeC();
    }

    public void buttonD(int i) {
        this.slots[i].executeD();
    }

}
