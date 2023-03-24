package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrganizado {
    public static void main(String[] args) {
        Set<String> listaStrings = new HashSet<>();


        listaStrings.add("Teste");
        listaStrings.add("Teste 2");
        listaStrings.add("Teste 3");

        listaStrings.forEach(System.out::println);

        SortedSet<Integer> listaNumbers = new TreeSet<>();

        listaNumbers.add(1);
        listaNumbers.add(2);
        listaNumbers.add(3);

        listaNumbers.forEach(System.out::println);

        for (int lista : listaNumbers) {
            System.out.println(lista);
        }
    }
}
