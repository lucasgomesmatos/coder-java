package poo.desafioHeranca.desafio;

public interface Luxo {

    void ligarAr();
    void desligarAr();

   default int velocidadeDoAr() {
        return 1;
   }
}
