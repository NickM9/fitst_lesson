package by.epam.first_lesson.loops;

// Найдите количество чётных цифр данного натурального числа.

public class LoopsThirtyFive {
    public static void main(String[] args) {
        int n = 68;
        int count = 0;

        while (n > 0){
            int tmp = n % 10;

            if (tmp % 2 == 0){
                count++;
            }

            n /= 10;
        }

        System.out.println(count);
    }
}
