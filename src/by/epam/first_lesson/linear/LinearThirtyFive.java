package by.epam.first_lesson.linear;

// Даны натуральные M и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

public class LinearThirtyFive {
    public static void main(String[] args) {
        int m = 200;
        int n = 7;

        System.out.println((double) m / n);
        System.out.println((10 * m / n) % 10);
        System.out.println((m/n) % 10);

    }
}
