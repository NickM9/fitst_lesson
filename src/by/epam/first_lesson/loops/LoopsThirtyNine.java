package by.epam.first_lesson.loops;

/*
В трёхзначном числе зачеркнули страшую цифру. Когда полученное число умножили на 7,
то получили исходное число. Найти это число.
 */

public class LoopsThirtyNine {
    public static void main(String[] args) {
        int num;

        for (int i = 100; i <= 999; i++){
            num = i % 100;

            if (num * 7 == i){
                System.out.println("Исходное : " + i + " Полученное : " + num);
            }
        }

    }
}
