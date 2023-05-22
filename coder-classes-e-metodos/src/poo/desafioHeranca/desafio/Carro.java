package poo.desafioHeranca.desafio;

public class Carro {

    protected int velocidade;
    private final int VELOCIDADE_MAXIMA;
    private int delta = 5;

    protected Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if ((velocidade + getDelta()) > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        }
        velocidade += getDelta();
    }

    public void freiar() {
        if (velocidade >= getDelta()) velocidade -= getDelta();
        else velocidade = 0;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public void velocidadeAtual() {
        System.out.println("Velocidade atual é " + velocidade);
    }


}
