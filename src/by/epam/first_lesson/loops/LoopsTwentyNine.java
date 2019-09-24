package by.epam.first_lesson.loops;

// Даны два числа. Определить цифры, входящие в состав как первого так и второго числа.

public class LoopsTwentyNine {
    public static void main(String[] args) {
        int first = 986234;
        int second = 5562193;

        while (first > 0){
            int tmpFirst = first % 10;

            for (int i = second; i > 0; i /= 10){
                int tmpSecond = i % 10;

                if (tmpFirst == tmpSecond){
                    System.out.print(tmpFirst + "\t");
                }

            }

            first /= 10;
        }
    }
}
