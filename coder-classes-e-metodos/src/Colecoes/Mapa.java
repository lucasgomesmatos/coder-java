package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Maria");
        usuarios.put(1, "João");
        usuarios.put(2, "Maria");

        System.out.println(usuarios);
        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String value: usuarios.values()) {
            System.out.println(value);
        }
    }
}
