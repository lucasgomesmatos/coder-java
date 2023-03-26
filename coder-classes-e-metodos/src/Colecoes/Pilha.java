package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("Pai rico e Pai pobre");
        livros.push("O poder da mente milonária");
        livros.push("O Hobbit");

        System.out.println(livros.poll());
        System.out.println(livros.pop());
        System.out.println(livros.peek());
        System.out.println(livros.element());
    }
}
