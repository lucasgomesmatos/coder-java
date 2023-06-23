package lambdas.consumidor;

import lambdas.predicado.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.toString());

        Produto p1 = new Produto("Notebook", 3000.0, 0.10);
        imprimir.accept(p1);

        Produto p2 = new Produto("Caderno", 25.0, 0.09);
        Produto p3 = new Produto("Borracha", 3.0, 0.03);
        Produto p4 = new Produto("Caneta", 2.0, 0.18);
        imprimir.accept(p1);

        List<Produto> produtos = List.of(p2, p3, p4);

        produtos.forEach(imprimir);
    }
}
