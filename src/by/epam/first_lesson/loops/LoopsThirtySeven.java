package by.epam.first_lesson.loops;

/*
Даны два двухзначных числа A и B. Из этих чисел составили 2 четырёхзначных числа:
первое число получили путён написания сначала числа A, затем B.
Для получения второго числа сначала записали число B, затем A.
Найти числа A и B если известно, что первое четырехзначное число нацело делится на 99, а второе на 49.
 */

public class LoopsThirtySeven {
    public static void main(String[] args) {
        int a, b, first, second;

        for (int i = 10; i <= 99; i++){
            a = i;

            for (int j = 10; j <= 99; j++){
                b = j;

                first = a * 100 + b;
                second = b * 100 + a;

                if (first % 99 == 0 && second % 49 ==0){
                    System.out.println("a = " + a + " b = " + b);
                    System.out.println("First = " + first + " Second = " + second);
                }
            }

        }
    }
}
