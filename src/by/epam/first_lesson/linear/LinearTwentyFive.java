package by.epam.first_lesson.linear;

/*
Вычислить корни квадратного уравнения ax^2 + bx + c = 0 с заданными коэффициентами a, b и c
(предполагается что a != 0 и что дискриминант уравнения не отрицателен)
 */

public class LinearTwentyFive {
    public static void main(String[] args) {

        int a = 2;
        int b = 9;
        int c = 5;

        double D = Math.pow(b, 2) - 4 * a * c;

        if (D < 0) {
            System.out.println("Корней нет");
        } else {

            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
