package by.epam.first_lesson.loops;

import static java.lang.Math.pow;

/*
Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше
или равен заданному e. Общий член ряла имеет вид:

a(n) = 1 / 2^n + 1 / 3^n
 */

public class LoopsNineteen {
    public static void main(String[] args) {
        double e = 0.3;
        int n = 8;
        double a;
        double sum = 0;

        for (int i = 1; i <= n; i++){

            a = (1 / pow(2, i)) + (1 / pow(3, i));
            System.out.println("a = " + a);

            if (Math.abs(a) >= e) {
                System.out.println("Подходящий \t" + a);
                sum += a;
            }

        }

        System.out.println("\nsum = " + sum);
    }
}
