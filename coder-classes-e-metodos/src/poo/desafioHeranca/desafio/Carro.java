package poo.desafioHeranca.desafio;

public class Carro {

    protected int velocidade;
    private final int VELOCIDADE_MAXIMA;
    protected int delta = 5;

    protected Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if ((velocidade + delta) > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        }
        velocidade += delta;
    }

    public void freiar() {
        if (velocidade >= delta) velocidade -= delta;
        else velocidade = 0;
    }

    public void velocidadeAtual() {
        System.out.println("Velocidade atual é " + velocidade);
    }


}
