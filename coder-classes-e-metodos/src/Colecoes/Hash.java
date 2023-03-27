package Colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Lucas"));
        usuarios.add(new Usuario("Maria"));
        usuarios.add(new Usuario("João"));

        System.out.println(usuarios.contains(new Usuario("João")));
    }
}
