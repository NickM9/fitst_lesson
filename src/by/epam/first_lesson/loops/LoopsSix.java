package by.epam.first_lesson.loops;

/*
Напишите программу, где ползователь вводит любое целое положительное число, а программа
суммтрует все числа от 1 до введённого пользователем числа.
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LoopsSix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
