package poo;

public class Motor {

    boolean ligado = false;
    double fatorInjecao = 1;

    int giros() {
        if (ligado) return (int) Math.round(fatorInjecao * 3000);

        return 0;
    }

}