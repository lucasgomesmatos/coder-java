package ArraysECollections;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade Alunos? ");
        int qtAlunos = entrada.nextInt();

        System.out.print("Quantidade notas por aluno? ");
        int qtNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtAlunos][qtNotas];

        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a %dº nota do %dº aluno: ", (n+1), (a+1));
                notasDaTurma[a][n] = entrada.nextDouble();
            }
        }

        double soma = 0;

        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {

                soma += notasDaTurma[a][n];
            }
        }
        double media = soma / (qtAlunos * qtNotas);
        System.out.printf("A media da turma é: %.2f" , media);

        for (double[] notasDoAlunos : notasDaTurma) {
            System.out.println("\n" + Arrays.toString(notasDoAlunos));
        }
    }
}
