package ArraysECollections;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Usuario outro) {

            boolean nome = outro.nome.equals(this.nome);
            boolean email = outro.email.equals(this.email);
            return nome && email;
        }
        return false;
    }



}
