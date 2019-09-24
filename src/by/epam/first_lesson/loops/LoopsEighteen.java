package by.epam.first_lesson.loops;

/*
Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше
или равен заданному e. Общий член ряла имеет вид:

a(n) = (-1)^n-1  /  n
 */

public class LoopsEighteen {
    public static void main(String[] args) {
        double e = 0.3;
        int n = 10;
        double a;
        double sum = 0;

        for (int i = 1; i <= n; i++){

            a = Math.pow(-1, i-1) / i;
            System.out.println("a = " + a);

            if (Math.abs(a) >= e) {
                System.out.println("Подходящий \t" + a);
                sum += a;
            }

        }

        System.out.println("\nsum = " + sum);
    }
}
