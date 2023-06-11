package lambdas.foreachFuncional;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("\n Lambda #01...");
        aprovados.forEach(nome -> System.out.println(nome));

        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);
    }
}
