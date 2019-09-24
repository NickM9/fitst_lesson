package by.epam.first_lesson.loops;

// вычислить: (1+2) * (1+2+3) * ... * (1+2+...+10).

public class LoopsSixteen {
    public static void main(String[] args) {
        long res = 1;
        int sum = 1;

        for (int i = 2; i <= 10; i++){

            sum += i;
            res *= sum;
            System.out.println("i = " + i + " sum = " + sum + " res = " + res);

        }

        System.out.println(res);
    }
}
