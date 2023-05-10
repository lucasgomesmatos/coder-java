package poo.desafioHeranca;

public class Ferrari extends Carro {

    Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        this.delta = 15;
    }

    @Override
    void acelerar() {
        velocidade += 15;
    }
}
