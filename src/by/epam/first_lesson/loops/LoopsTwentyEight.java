package by.epam.first_lesson.loops;

/*
Написать программу, в которой вводятся два операнда X и Y и знак операции (+, -, /, *).
Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак оерации,
а так же на ввод Y=0 при делении. Организовать возможности многократных вычислений без перезагрузки
программы (т.е. построить цикл). В качестве символа прекращения вычислений принять '0'.
 */

import java.util.Scanner;

public class LoopsTwentyEight {
    public static void main(String[] args) {

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input '0' for exit or one of signs +, -, *, /");
            char sign = sc.nextLine().charAt(0);

            if (sign == '0'){
                break;
            } else if (sign != '+' && sign != '-' && sign != '*' && sign != '/'){
                System.out.println("Wrong sign\n");
            } else {
                System.out.println("Input X : ");
                double x = sc.nextDouble();
                System.out.println("Input Y : ");
                double y = sc.nextDouble();
                double z = 0;

                if (sign == '/' && y == 0) {
                    System.out.println("Alarm!!! Division by 0\n");
                } else {

                    switch (sign){
                        case '+' :
                            z = x + y;
                            break;
                        case '-' :
                            z = x - y;
                            break;
                        case '*' :
                            z = x * y;
                            break;
                        case '/' :
                            z = x / y;
                            break;
                    }
                    System.out.println(z + "\n");
                }
            }
        }
    }
}
