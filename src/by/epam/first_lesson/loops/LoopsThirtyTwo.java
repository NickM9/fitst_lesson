package by.epam.first_lesson.loops;

/*
Проверить введённую пользователем строку на наличие недопустимых символов. В качестве первого
символа допустимы только буквы и знак подчёркивания. Остальные символы могут быть буквами, цифрами и
знаком подчёркивания.
 */

import java.util.Scanner;

public class LoopsThirtyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = sc.nextLine();
        boolean hasInvalidChars = false;

        if (!(str.charAt(0) == '_' || Character.isLetter(str.charAt(0)))){
            hasInvalidChars = true;
        }

        for (int i = 1; i < str.length(); i++){

            if (!(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)) || str.charAt(i) == '_')){
                hasInvalidChars = true;
            }

        }

        System.out.println("Наличие недопустимых символов : " + hasInvalidChars);
    }
}
