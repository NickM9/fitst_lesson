package by.epam.first_lesson.loops;

import static java.lang.Math.pow;

// Составить программу нахождения разности кубов первых двухсот чисел

public class LoopsEleven {
    public static void main(String[] args) {

        for (int i = 200; i >= 1; i--){

            System.out.print("i = " + i + "\t" + pow(i, 3) + " - " + pow(i-1, 3) + " = ");
            System.out.println(pow(i, 3) - pow(i-1, 3));

        }
    }
}
