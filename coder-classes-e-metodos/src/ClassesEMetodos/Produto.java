package ClassesEMetodos;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto () {}
    Produto(String nomeInicial) {
        this.nome = nomeInicial;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    double precoComDesconto() {
        return preco - (preco * desconto);
    }

    double precoComDesconto(double descontoAdicional) {
        return preco * (1 - desconto - descontoAdicional);
    }
}
