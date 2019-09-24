package by.epam.first_lesson.loops;

/*
Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать.
Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, а также
ошибочные числа пользователя.
 */

import java.util.Arrays;
import java.util.Scanner;

public class LoopsThirtyOne {
    public static void main(String[] args) {
        int[] comp = new int[5];
        int[] player = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your 5 variants from 1 to 15 : ");
        for (int i = 0; i < 5; i++){
            comp[i] = 1 + (int) (Math.random() * 15);
            player[i] = sc.nextInt();
        }

        System.out.print("Угаданные числа : ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){

                if (comp[i] == player[j]){
                    System.out.print(comp[i] + " ");
                }

            }
        }
        System.out.println("\n");

        boolean has = false;
        System.out.print("Не угаданные числа : ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){

                if (comp[i] == player[j]){
                    has = true;
                }

            }
            if (!has){
                System.out.print(comp[i] + " ");
            }
            has = false;
        }
        System.out.println("\n");

        System.out.println("Ошибочные числа пользователя : ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){

                if (player[i] == comp[j]){
                    has = true;
                }

            }
            if (!has){
                System.out.print(player[i] + " ");
            }
            has = false;
        }
        System.out.println("\n");

        System.out.println("comp "  + Arrays.toString(comp));
        System.out.println("player " + Arrays.toString(player));

    }
}
