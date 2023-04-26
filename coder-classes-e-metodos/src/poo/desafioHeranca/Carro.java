package poo.desafioHeranca;

public class Carro {

    int velocidade;

    void acelerar() {
        velocidade += 5;
    }

    void freiar() {
        if (velocidade >= 5) velocidade -= 5;
        else velocidade = 0;
    }

    void velocidadeAtual() {
        System.out.println("Velocidade atual é " + velocidade);
    }


}
