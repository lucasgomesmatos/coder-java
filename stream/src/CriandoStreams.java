import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;

        Stream<String> langs = Stream.of("Java ", "TypeScript ", "JavaScript\n");

        langs.forEach(print);

        String[] maisLangs = {"Python ", "PHP ", "GO\n"};

        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);

        Arrays.stream(maisLangs, 1, 2).forEach(print);
        List<String> outrasLang = Arrays.asList("C", " C++", " Kotlin\n");
        outrasLang.stream().forEach(print);
        outrasLang.parallelStream().forEach(print);
        Stream.iterate(0, n -> n + 1).forEach(print);
    }
}
