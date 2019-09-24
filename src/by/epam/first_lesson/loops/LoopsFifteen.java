package by.epam.first_lesson.loops;

// Вычислить: 1+2+3+4+8+ ... + 2 в 10 степени.

public class LoopsFifteen {
    public static void main(String[] args) {
        int res = 0;

        for (int i = 1; i <= Math.pow(2, 10); i *= 2){
            res += i;
        }

        System.out.println(res);
    }
}
