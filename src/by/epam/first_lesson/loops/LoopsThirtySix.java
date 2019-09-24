package by.epam.first_lesson.loops;

/*
Два двухзначных числа, записанных одно за другим, образуют четырёхзначное число, которое делится
на их произведение. Найти эти числа.
 */

public class LoopsThirtySix {
    public static void main(String[] args) {

        for (int i = 1000; i < 9999; i++){
            int first = i / 100;
            int second = i % 100;
            int pr = first * second;

            if (pr != 0 && i % pr == 0){
                System.out.println("Num : " + i + "\tFirst num : " + first + "\tSecond num : " + second);
            }
        }



    }
}
