package by.epam.first_lesson.loops;

/*
Последовательность a(n) строится так: a(1) = 1, an = 6 + a(n-1),
для каждого n > 1. Составьте программу нахождения произведения первых 10 членов этой последовательности.
 */

public class LoopsTwelve {
    public static void main(String[] args) {
        int n = 10;
        int a = 1;
        long res = 1;

        for (int i = 2; i <= n; i++){
            a += 6;
            res *= a;
            System.out.println("Член последовательности номер " + i + " = " + a);
        }

        System.out.println("Произведение первых десяти членов = " + res);
    }
}
