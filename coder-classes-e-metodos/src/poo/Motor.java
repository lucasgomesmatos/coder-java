package poo;

public class Motor {
    Carro carro;

    boolean ligado = false;
    double fatorInjecao = 1;

    public Motor(Carro carro) {
        this.carro = carro;
    }

    int giros() {
        if (ligado) return (int) Math.round(fatorInjecao * 3000);

        return 0;
    }

}
