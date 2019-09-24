package by.epam.first_lesson.loops;

// Составить таблицу значений функции y = 5 - x^2 / 2 на отрезке [-5; 5] с шагом 0.5.

public class LoopsThirteen {
    public static void main(String[] args) {
        double y = 0;

        System.out.println("\tx\ty");
        for (double x = -5; x <= 5; x += 0.5){

            y = 5 - Math.pow(x, 2) / 2;

            System.out.println(x + " | " + y);
        }

    }
}
