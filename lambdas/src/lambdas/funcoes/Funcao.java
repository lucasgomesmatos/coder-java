package lambdas.funcoes;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(32));

        Function<String, String> resultado = valor -> "O resultado é "+ valor;

        String resultadoFinal = parOuImpar.andThen(resultado).apply(32);
        System.out.println(resultadoFinal);
        System.out.println();
    }
}
