package by.epam.first_lesson.loops;

// Найдите все четырёхзначные числа, сумма цифр каждого из которых равна 15.

public class LoopsThirtyFour {
    public static void main(String[] args) {
        int sum, ex, tmp;

        for (int i = 1000; i <= 9999; i++){
            sum = 0;
            ex = i;

            while (ex > 0){
                tmp = ex % 10;
                sum += tmp;
                ex /= 10;
            }

            if (sum == 15){
                System.out.println(i);
            }
        }

    }
}
