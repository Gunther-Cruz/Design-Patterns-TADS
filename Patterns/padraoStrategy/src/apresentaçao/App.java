package apresentaçao;

import java.util.Random;
import Personagens.*;
import armas.*;

public class App {
       public static void main(String[] args) {
              Random random = new Random();

              Cavaleiro cavaleiroImperio = new Cavaleiro();
              Rainha rainha = new Rainha();
              Rei rei = new Rei();
              CavaleiroInimigo cavaleiroRebelde = new CavaleiroInimigo();

              System.out.println("Batalha iniciada!");
              int round = 0;

              while (cavaleiroRebelde.getVida() > 0 && rei.getVida() > 0) {
                     round++;
                     System.out.println("\nRound " + round);

                     int dado = random.nextInt(11);
                     if (dado == 6) {
                            cavaleiroRebelde.display();
                            cavaleiroRebelde.performAttack(cavaleiroImperio);
                            cavaleiroRebelde.performSpecialAttack(cavaleiroImperio);
                     } else if (dado == 0) {
                            cavaleiroRebelde.display();
                            cavaleiroRebelde.performSpecialAttack(cavaleiroImperio);
                     } else {
                            cavaleiroRebelde.display();
                            cavaleiroRebelde.performAttack(cavaleiroImperio);
                     }

                     cavaleiroImperio.display();
                     cavaleiroImperio.performAttack(cavaleiroRebelde);

                     rainha.display();
                     rainha.performAttack(cavaleiroRebelde);

                     cavaleiroRebelde.display();
                     cavaleiroRebelde.performAttack(rainha);

                     cavaleiroRebelde.display();
                     cavaleiroRebelde.performAttack(cavaleiroImperio);

                     dado = random.nextInt(11);
                     if (dado == 6) {
                            cavaleiroRebelde.display();
                            cavaleiroRebelde.performAttack(rei);
                            cavaleiroRebelde.performAttack(cavaleiroRebelde);
                     } else if (dado == 0) {
                            cavaleiroRebelde.display();
                            cavaleiroRebelde.performSpecialAttack(rei);
                     } else {
                            cavaleiroRebelde.display();
                            cavaleiroRebelde.performAttack(rei);
                     }

                     rei.display();
                     rei.performAttack(cavaleiroRebelde);

                     int armaRainha = random.nextInt(2);
                     // 0 = Arco, 1 = Faca
                     int armaRei = random.nextInt(3);
                     // 0 = Arco, 1 = Faca, 2 = Soco

                     if (armaRainha == 0) {
                            rainha.setArma(new Arco());
                     } else {
                            rainha.setArma(new Faca());
                     }

                     if (armaRei == 0) {
                            rei.setArma(new Arco());
                     } else if (armaRei == 1) {
                            rei.setArma(new Faca());
                     } else {
                            rei.setArma(new Soco());
                     }

                     System.out.println(cavaleiroImperio);
                     System.out.println(rainha);
                     System.out.println(rei);
                     System.out.println(cavaleiroRebelde);
                     System.out.println();

                     if (cavaleiroImperio.getVida() <= 0) {
                            System.out.println("Cavaleiro Jardel foi derrotado!");
                            cavaleiroImperio = null;
                     }

                     if (rainha.getVida() <= 0) {
                            System.out.println("Rainha Galencia foi derrotada!");
                            rainha = null;
                     }

                     if (rei.getVida() <= 0) {
                            rei = null;
                     }

                     if (cavaleiroRebelde.getVida() <= 0) {
                            cavaleiroRebelde = null;
                     }

                     if (cavaleiroRebelde == null || rei == null) {
                            break;
                     }

              }

              if (rei == null && cavaleiroRebelde == null) {
                     System.out.println("Ambos, o Rei e o Cavaleiro Inimigo, morreram.");
              } else if (rei == null) {
                     System.out.println("O Rei morreu. O Cavaleiro Inimigo venceu.");
              } else {
                     System.out.println("O Cavaleiro Inimigo foi derrotado. Vitória!");
              }

              System.out.println("Fim da batalha! Total de rounds: " + round);
       }
}
