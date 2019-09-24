package by.epam.first_lesson.linear;

/*
Дано действительное число x. Не пользуясь никакими другими арифметическими операциями, кроме
умножения, сложения и вычитания, вычислите за минимальное число операций:

 2 * x^4 - 3 * x^3 + 4 * x^2 - 5*x + 6
 */

public class LinearThirtyNine {
    public static void main(String[] args) {

        int x = 2;
        int res = (((2*x - 3) * x + 4) * x - 5) * x + 6;

        System.out.println(res);
    }
}
