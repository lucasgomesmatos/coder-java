package poo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {
        var convidado = new Pessoa(99);

        Arroz a1 = new Arroz(0.250);
        Feijao f2 = new Feijao(0.180);
        Sorvete s3 = new Sorvete(0.180);

        System.out.println(convidado.getPeso());

        convidado.comer(a1);
        convidado.comer(f2);
        System.out.println(convidado.getPeso());

    }
}
