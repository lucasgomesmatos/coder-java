package ClassesEMetodos;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.nome = "Tv";
        produto.preco = 1500;
        Produto.desconto = 0.29;

        var produtocomDesconto = produto.precoComDesconto();
        var produtocomDesconto2 = produto.precoComDesconto(0.1);

        System.out.println(produtocomDesconto);
        System.out.println(produtocomDesconto2);

        System.out.println(produto.nome);


    }
}
