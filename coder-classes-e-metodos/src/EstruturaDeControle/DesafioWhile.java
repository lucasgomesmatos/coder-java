package EstruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        double nota = 0;
        double total = 0;
        int quantidadeDeNotas = 0;

        while (nota != -1 ) {
            System.out.println("Digite uma nota entre 1 a 10 pontos: ");
            nota = entrada.nextDouble();

            if(nota > 10) {
                System.out.println("Digite uma nota valida: ");
                nota = entrada.nextDouble();
            }

            if(nota >= 0 && nota <= 10) {
                total += nota;
                quantidadeDeNotas++;
            }

        }

        System.out.println("Media = " + total / quantidadeDeNotas);

    }
}
