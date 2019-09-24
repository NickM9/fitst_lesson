package by.epam.first_lesson.loops;

/*
Составить программу для вычисления значений функции F(x) на отрезке [a, b] с шагом h.
Результат представить в виде таблицы, первый столбец которой - значения аргумента,
второй соответствующие значения функции:

F(x) = sin^2(x)
 */

public class LoopsTwentyTwo {
    public static void main(String[] args) {
        int a = -5;
        int b = 5;
        int h = 2;
        double f;

        System.out.println("x\tF(x)");
        for (int i = a; i <= b; i += h){

            f = Math.pow(Math.sin(Math.toRadians(i)), 2);
            System.out.println(i + " | " + f);

        }

    }
}
