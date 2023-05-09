package poo.desafioHeranca;

public class Carro {

    int velocidade;

    final int VELOCIDADE_MAXIMA;

    final int delta = 5;

    Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {

        if ((velocidade + delta) > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        }

        velocidade += delta;
    }

    void freiar() {
        if (velocidade >= delta) velocidade -= delta;
        else velocidade = 0;
    }

    void velocidadeAtual() {
        System.out.println("Velocidade atual é " + velocidade);
    }


}
