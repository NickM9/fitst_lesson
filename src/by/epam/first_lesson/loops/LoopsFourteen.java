package by.epam.first_lesson.loops;

// Дано натуральное число n. Вычислить 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

public class LoopsFourteen {
    public static void main(String[] args) {
        double res = 0;
        int n = 5;

        for (int i = 1; i <= n; i++){

            res += (double) 1 / i;
            System.out.println("i = " + i + " res = " + res);

        }

        System.out.println(res);
    }
}
