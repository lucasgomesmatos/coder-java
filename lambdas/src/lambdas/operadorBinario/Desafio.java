package lambdas.operadorBinario;

import lambdas.predicado.Produto;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("Ipad", 3235.89, 0.13);

        BiFunction<Double, Double, String> resultado = (valor, desconto) -> {
            double valorComDesconto = valor - (valor * desconto);
            double valorComImposto = valorComDesconto >= 2500 ? (valorComDesconto * 0.085) + valorComDesconto : valorComDesconto;
            double valorComFrete = valorComImposto >= 3000 ? valorComImposto + 100 : valorComImposto + 50;
            double valorFinal = Math.round(valorComFrete);
            return String.format("R$ %.2f", valorFinal);
        };

        System.out.println(resultado.apply(p.getPreco(), p.getDesconto()));

        Function<Produto, Double> precoFinal = produto -> produto.getPreco() * (1 - produto.getDesconto());
        UnaryOperator<Double> impostoMunicipal = valor -> valor >= 2500 ? valor * 1.085 : valor;
        UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
        UnaryOperator<Double> arrendondar = valor -> (double) Math.round(valor);
        Function<Double, String> formatar = valor -> String.format("R$ %.2f", valor);

        Produto p2 = new Produto("Ipad", 3235.89, 0.13);

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arrendondar)
                .andThen(formatar)
                .apply(p2);

        System.out.println("O pre final é " + preco);

    }
}
