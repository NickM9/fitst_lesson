package by.epam.first_lesson.loops;

/*
Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры
 */

public class LoopsForty {
    public static void main(String[] args) {
        int n = 450;
        boolean isAll = true;
        int ex, tmp;

        for (int i = 1; i <= n; i++){
            ex = i;

            while (ex > 0){
                tmp = ex % 10;

                if (tmp == 0 || i % tmp != 0){
                    isAll = false;
                    break;
                }

                ex /= 10;
            }

            if (isAll){
                System.out.println("Число : " + i);
            }
            isAll = true;
        }
    }
}
