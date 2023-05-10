package poo.desafioHeranca.desafio;

public class Ferrari extends Carro {

    public Ferrari() {
        super(340);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        this.delta = 15;
    }

    @Override
    public void acelerar() {
        velocidade += 15;
    }
}
