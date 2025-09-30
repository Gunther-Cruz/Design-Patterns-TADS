package armas;

import java.util.Random;

import Personagens.Personagem;

public abstract class Arma {

    protected int dano;

    public void ataca(Personagem personagem) {
        personagem.setVida(personagem.getVida() - this.getDano());
    }

    public void atacaEspecial(Personagem personagem) {
        personagem.setVida(personagem.getVida() - this.getDano()/2);
    }

    public Arma(int dano) {
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Arma() {
        this.dano = new Random().nextInt(12);
    }

    public void display() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
