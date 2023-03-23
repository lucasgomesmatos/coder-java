package ArraysECollections;

import java.util.Arrays;

public class ArrayExercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[9];

        notasAlunoA[0] = 7;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 3;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;

        for (double v : notasAlunoA) {
            total += v;
        }

        System.out.println(total);
    }
}
