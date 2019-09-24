package by.epam.first_lesson.loops;

import static java.lang.Math.*;

/*
Составить программу для вычисления значений функции F(x) на отрезке [a, b] с шагом h.
Результат представить в виде таблицы, первый столбец которой - значения аргумента,
второй соответствующие значения функции:

F(x) = ctg(x/3) + 1/2*sin(x)
 */

public class LoopsTwentyThree {
    public static void main(String[] args) {
        int a = 3;
        int b = 12;
        int h = 2;
        double f;

        System.out.println("x\tF(x)");
        for (int i = a; i <= b; i += h){

            f = (1 / tan(toRadians(i/3))) + ((1 / 2) * sin(toRadians(i)));
            System.out.println(i + " | " + f);

        }
    }
}
