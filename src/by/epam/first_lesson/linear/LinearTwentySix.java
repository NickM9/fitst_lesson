package by.epam.first_lesson.linear;

// Найти площадь треугольника, две стороны кторого равны a и b, а угол между этими сторонами y.

public class LinearTwentySix {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        double y = 30;
        y = Math.toRadians(y);

        double res = 0.5 * a * b * Math.sin(y);

        System.out.println(res);
    }
}
