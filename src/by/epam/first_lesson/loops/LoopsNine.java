package by.epam.first_lesson.loops;

// Найти сумму квадратов первых ста чисел

public class LoopsNine {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++){
            sum += Math.pow(i, 2);
        }

        System.out.println(sum);
    }
}
