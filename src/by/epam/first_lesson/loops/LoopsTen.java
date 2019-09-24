package by.epam.first_lesson.loops;

// Составить программу нахождения произведения квадратов первых двухсот чисел

import java.math.BigInteger;

public class LoopsTen {
    public static void main(String[] args) {
        BigInteger res = BigInteger.valueOf(1);

        for (int i = 1; i <= 200; i++){
            int tmp = (int) Math.pow(i, 2);
            res = res.multiply(BigInteger.valueOf(tmp));
        }

        System.out.println(res);
    }
}
