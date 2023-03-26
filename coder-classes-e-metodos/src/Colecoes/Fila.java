package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Ofter e Add -> adicionam elementos na fila
        // Diferença ocorre quando a fila esteja cheia.
        fila.add("Ana");
        fila.add("Maria"); // lança uma exceção
        fila.offer("Bia"); // retorna false
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Gui");

        // Peek e Element -> obtem o primeiro da fila (sem remover)
        // Diferença é o comportamento ocorre quando a fila está vazia.

        System.out.println(fila.peek());    // retorna null
        System.out.println(fila.element()); // retorna uma exceção


        System.out.println(fila.size());
        fila.isEmpty();
        fila.clear();
        fila.poll();
    }
}
