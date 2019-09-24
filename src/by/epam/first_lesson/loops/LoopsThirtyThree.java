package by.epam.first_lesson.loops;

// Найдите наибольшую цифру данного натурального числа.

public class LoopsThirtyThree {
    public static void main(String[] args) {
        int n = 872543;
        int max = 0;

        while (n > 0){
            int tmp = n % 10;

            if (tmp > max){
                max = tmp;
            }

            n /= 10;
        }

        System.out.println(max);
    }
}
