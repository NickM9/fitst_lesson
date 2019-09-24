package by.epam.first_lesson.linear;

// Найти частное произведений чётных и нечётных цифр четырёх значного числа.

public class LinearThirtySix {
    public static void main(String[] args) {
        int x = 1294;

        int prCH = 1;
        int prNeCH = 1;

        for (int i = 0; i < 4; i++){
            int tmp = x % 10;

            if ( (tmp) % 2 == 1){
                prNeCH *= (tmp);
            } else {
                prCH *= (tmp);
            }

            x /= 10;
        }

        System.out.println((double) prCH / prNeCH);
    }
}
