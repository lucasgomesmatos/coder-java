package ArraysECollections;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas que você quer amarzenar: ");
        int qtNotas = scanner.nextInt();

        double [] notas = new double[qtNotas];

        for (int i = 0; i < qtNotas; i++) {
            System.out.println("Digite a " + (i + 1) + "° nota do aluno: ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        System.out.printf("\nA média é : %.2f ", (soma / qtNotas));
    }
}
