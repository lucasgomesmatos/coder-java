package ClassesEMetodos.DesafioFinal;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz com Feijão e Carne", 0.500);
        Comida c2 = new Comida("Feijoada", 0.800);

        Pessoa p1 = new Pessoa("João", 65.0);
        Pessoa p2 = new Pessoa("Maria", 65.0);

        p1.apresentar();
        p2.apresentar();
        System.out.println("--------------------------");

        p1.comer(c1);
        p2.comer(c2);
        p1.comer(c1);
        p2.comer(c2);

        p1.apresentar();
        p2.apresentar();
    }
}
