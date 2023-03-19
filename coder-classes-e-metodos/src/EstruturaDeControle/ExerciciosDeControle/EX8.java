package EstruturaDeControle.ExerciciosDeControle;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        // 8. Criar um programa que receba uma palavra e imprime no console letra por letra.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        char letras[] = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
    }
}
