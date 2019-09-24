package by.epam.first_lesson.loops;

//Требкется определить факториал числа, которое ввел пользователь.

import java.util.Scanner;

public class LoopsTwentyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        int res = 1;

        for (int i = n; i > 0; i--){
            res *= i;
        }

        System.out.println(res);
    }
}
