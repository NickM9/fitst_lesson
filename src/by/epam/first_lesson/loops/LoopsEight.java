package by.epam.first_lesson.loops;

/*
Вычислить значения функции на отрезке [a, b] с шагом h:
    (x + c) * 2, x = 15
y =
    (x - c) + 6, x != 15
 */

public class LoopsEight {
    public static void main(String[] args) {
        int a = -3;
        int b = 17;
        int h = 3;
        int c = 1;
        int y;

        for (int x = a; x <= b; x += h){

            y = (x == 15) ? ((x + c) * 2) : ((x - c) + 6);
            System.out.println("При значении x= " + x + " функция y= " + y);

        }
    }
}
