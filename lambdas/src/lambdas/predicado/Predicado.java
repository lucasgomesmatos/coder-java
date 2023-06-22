package lambdas.predicado;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
        Predicate<Produto> produtoCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

        var produto = new Produto("Notebook", 3893.89, 0.85);

        System.out.println(produtoCaro.test(produto));
    }
}
