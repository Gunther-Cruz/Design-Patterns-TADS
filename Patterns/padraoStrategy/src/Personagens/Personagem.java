package Personagens;

import armas.Arma;

public abstract class Personagem {

    protected Arma arma;
    protected int vida;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void performAttack(Personagem personagem) {
        this.arma.ataca(personagem);
    }

    public void performSpecialAttack(Personagem personagem) {
        this.arma.ataca(personagem);
    }

    public void display() {
        System.out.print(this.getClass().getSimpleName() + " ataca com ");
        System.out.println(this.arma);
    }

    @Override
    public String toString() {
        return "[nome = " + this.getClass().getSimpleName() + ", vida = " + vida + " ]";
    }

}