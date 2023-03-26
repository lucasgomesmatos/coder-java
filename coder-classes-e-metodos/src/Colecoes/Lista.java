package Colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        Usuario u1 = new Usuario("João");
        listaUsuarios.add(u1);
        listaUsuarios.add(new Usuario("Maria"));
        listaUsuarios.add(new Usuario("Carlos"));
        listaUsuarios.add(new Usuario("Ana"));

        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }
    }
}
