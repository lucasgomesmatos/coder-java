package poo.desafioHeranca;

public class Ferrari extends Carro {

    Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    void acelerar() {
        velocidade += 15;
    }
}
