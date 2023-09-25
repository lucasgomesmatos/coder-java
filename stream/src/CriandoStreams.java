import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "TypeScript ", "JavaScript\n");

        langs.forEach(print);

        String [] maisLangs = {"Python ", "PHP ", "GO\n"};

        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);
    }
}
