package poo.heranca;

public class Jogo {

    public static void main(String[] args) {
        var monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        var heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(DirecaoEnum.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro: " + monstro.vida);
        System.out.println("Heroi: " +heroi.vida);
    }
}
