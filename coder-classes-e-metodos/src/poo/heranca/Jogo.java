package poo.heranca;

public class Jogo {

    public static void main(String[] args) {
        var j1 =new Jogador();
        j1.andar(DirecaoEnum.NORTE);
        j1.andar(DirecaoEnum.LESTE);
        j1.andar(DirecaoEnum.NORTE);
        j1.andar(DirecaoEnum.LESTE);

        System.out.println(j1.y);
        System.out.println(j1.x);
    }
}
