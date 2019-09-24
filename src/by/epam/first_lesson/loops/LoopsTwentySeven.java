package by.epam.first_lesson.loops;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
*/

import java.util.Scanner;

public class LoopsTwentySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input m : ");
        int m = sc.nextInt();
        System.out.println("Input n : ");
        int n = sc.nextInt();

        for (int i = m; i <= n; i++){

            System.out.print(i + " : ");
            for (int j = 2; j <= i-1; j++){


                if (i % j == 0){
                    System.out.print(j + " ");
                }

            }
            System.out.println();
        }

    }
}
