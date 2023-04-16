package poo.heranca;

public class Jogador {

    int x;
    int y;

    boolean andar(DirecaoEnum direcao) {

        switch (direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
            default:
                break;
        }



        return true;
    }
}
