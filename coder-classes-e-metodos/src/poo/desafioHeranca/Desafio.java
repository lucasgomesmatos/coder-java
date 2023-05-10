package poo.desafioHeranca;

import poo.desafioHeranca.desafio.Ferrari;
import poo.desafioHeranca.desafio.Civic;

public class Desafio {

    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        Civic civic = new Civic();

        ferrari.acelerar();
        civic.acelerar();

        ferrari.acelerar();
        civic.acelerar();

        ferrari.velocidadeAtual();
        civic.velocidadeAtual();
    }
}
