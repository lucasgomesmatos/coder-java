package lambdas.foreachFuncional;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        aprovados.forEach(nome -> System.out.println(nome));
    }
}
