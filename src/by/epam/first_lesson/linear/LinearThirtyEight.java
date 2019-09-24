package by.epam.first_lesson.linear;

import static java.lang.Math.pow;
/*
Для данных областей составить линейную программу, которая печатает true, если точка
с координатами (x, y) принадлежит закрашенной области, и false - в противном случае.
 */

public class LinearThirtyEight {
    public static void main(String[] args) {
        // Рисунок a (треугольник)
        int x = -1;
        int y = 2;

        System.out.print("Рисунок a : ");
        System.out.println( x >= -4 && x <= 4 && y >= 0 && y <= 4 - Math.abs(x) );

        // Рисунок b (Пирамида)
        x = 2;
        y = 4;

        System.out.print("Рисунок b : ");
        System.out.println( (x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4) );

        // Рисунок c (Круги)
        x = 2;
        y = 3;
        System.out.print("Рисунок c : ");
        System.out.println( (x >= 0 && x <= 4 && y >= 0 && y <= 4 && pow(x, 2) + pow(y, 2) <= 16) ||
                (x >= 0 && x <= 5 && y <= 0 && y >= -5 && pow(x, 2) + pow(y, 2) <= 25) );
    }
}
