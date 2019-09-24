package by.epam.first_lesson.linear;

// Найти (в радианах, в градусах) все углы треугольника со сторонами a, b, c.

import static java.lang.Math.*;

public class LinearTwentyNine {
    public static void main(String[] args) {

        double angle;

        int a = 4;
        int b = 3;
        int c = 5;

        angle = (pow(a, 2) + pow(b, 2) - pow(c, 2)) / (2 * a * b);
        angle = acos(angle);
        System.out.println("First angle in radians = " + angle +  "; First angle in degrees = " + toDegrees(angle));

        angle = (pow(a, 2) + pow(c, 2) - pow(b, 2)) / (2 * a * c);
        angle = acos(angle);
        System.out.println("Second angle in radians = " + angle +  "; Second angle in degrees = " + toDegrees(angle));

        angle = (pow(b, 2) + pow(c, 2) - pow(a, 2)) / (2 * b * c);
        angle = acos(angle);
        System.out.println("Third angle in radians = " + angle +  "; Third angle in degrees = " + toDegrees(angle));
    }
}
