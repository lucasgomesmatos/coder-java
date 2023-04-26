package poo.desafioHeranca;

public class Desafio {

    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        Civic civic = new Civic();

        ferrari.acelerar();
        civic.acelerar();

        ferrari.velocidadeAtual();
        civic.velocidadeAtual();
    }
}
