package by.epam.first_lesson.loops;

/*
Вычислить значения функции на отрезке [a, b] с шагом h:
    x, x > 2
y =
    -x, x <= 2
 */

public class LoopsSeven {
    public static void main(String[] args) {
        int a = -5;
        int b = 7;
        int h = 2;
        int y;

        for (int x = a; x <= b; x += h){
            y = (x > 2) ? x : -x;
            System.out.println("При значении x= " + x + " функция y= " + y);
        }
    }
}
