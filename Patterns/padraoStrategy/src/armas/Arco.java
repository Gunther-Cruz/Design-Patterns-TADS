package armas;

import java.util.Random;

import Personagens.Personagem;

public class Arco extends Arma {
    public Arco() {
        super();
    }

    public void ataca(Personagem personagem) {
        super.dano = new Random().nextInt(12);
        personagem.setVida(personagem.getVida() - super.getDano());
    }
}
