package by.epam.first_lesson.loops;

/*
Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию.
Предполагается что в числе не менее трёх цифр. Например : 1357, 963.
 */

public class LoopsThirtyEight {
    public static void main(String[] args) {
        int num = 963;
        boolean isProgression = true;
        int buf1 = num % 10;
        num /= 10;
        int buf2 = num % 10;
        num /= 10;
        int difference = buf1 - buf2;

        while (num > 0) {
            int tmp = num % 10;

            if (buf2 - tmp != difference){
                isProgression = false;
                break;
            }

            buf2 = tmp;
            num /= 10;
        }

        System.out.println("Цифры образуют арифметическую прогрессию : " + isProgression);
    }
}
