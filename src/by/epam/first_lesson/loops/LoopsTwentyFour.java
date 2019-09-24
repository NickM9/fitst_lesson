package by.epam.first_lesson.loops;

/*
Вводится натуральное число. Найти сумму чётных цифр, входящих в его состав.
Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введённым числом.
 */

import java.util.Scanner;

public class LoopsTwentyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        int x = n;
        int sum = 0;
        int reverseN = 0;
        int tmp;

        while (x != 0){
            tmp = x % 10;

            if (tmp % 2 == 0){
                sum += tmp;
            }

            x /= 10;
        }

        System.out.println("sum = " + sum);

        x = n;
        while (x > 0){
            tmp = x % 10;
            reverseN += tmp;
            reverseN *= 10;
            x /= 10;
        }
        reverseN /= 10;

        System.out.println("Reverse n = " + reverseN);

    }
}
