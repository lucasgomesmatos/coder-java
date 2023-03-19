package EstruturaDeControle.ExerciciosDeControle;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {

        // 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.

        Scanner scanner = new Scanner(System.in);

        int maior = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            if(numero > maior) {
                maior = numero;
            }
        }

    System.out.println("O maior número é " + maior);



    }
}
