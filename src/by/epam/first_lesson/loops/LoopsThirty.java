package by.epam.first_lesson.loops;

// Написать программу, переводящую римские цифры в арабские.

import java.util.Scanner;

public class LoopsThirty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Roman numeral : ");
        String input = sc.nextLine();
        int res = 0;

        switch (input){
            case "I" :
                res = 1;
                break;
            case "IV" :
                res = 4;
                break;
            case "V" :
                res = 5;
                break;
            case "IX" :
                res = 9;
                break;
            case "X" :
                res = 10;
                break;
            case "XL" :
                res = 40;
                break;
            case "L" :
                res = 50;
                break;
            case "XC" :
                res = 90;
                break;
            case "C" :
                res = 100;
                break;
            case "CD" :
                res = 400;
                break;
            case "D" :
                res = 500;
                break;
            case "CM" :
                res = 900;
                break;
            case "M" :
                res = 1000;
                break;
        }

        System.out.println(input + " : " + res);
    }
}
