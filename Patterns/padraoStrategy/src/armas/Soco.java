package armas;

import java.util.Random;

import Personagens.Personagem;

public class Soco extends Arma {
    public Soco() {
        super();
    }

    public void ataca(Personagem personagem) {
        super.dano = new Random().nextInt(12);
        personagem.setVida(personagem.getVida() - super.getDano());
    }
}
