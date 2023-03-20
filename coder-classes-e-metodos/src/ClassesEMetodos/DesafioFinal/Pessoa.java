package ClassesEMetodos.DesafioFinal;

public class Pessoa {

    String nome;
    double peso;



    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if(comida != null) {
            this.peso += comida.peso;
        }
    }

    void apresentar() {
        System.out.printf("%s, tem %.2f quilos\n", this.nome, this.peso);
    }
}
