package by.epam.first_lesson.linear;

import static java.lang.Math.pow;
/*
Сосотавить линейную программу печатающую true или false:
* Целое число N является чётным двухзначным.
* Сумма двух первых цифр заданного четырёхзнаного числа равна сумме двух его последних цифр.
* Сумма Цифр данного трёхзначного числа N является чётным числом.
* Точка с координатами (x, y) принадлежит части плоскости, лежащей между прямыми x = m, x = n. (m < n).
* Квадрат данного трехзначного числа равен кубу суммы цифр этого числа.
* Треугольник со сторонами a, b, c является равнобедренным.
* Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
* Заданное число N является стпению числа a (показатель степени можнт находиться в диапазоне от 0 до 4).
* График функции y = ax^2 + bx + c проходит через заданную точку с координатами (m, n).
 */

public class LinearThirtySeven {
    public static void main(String[] args) {

        // Целое число N является чётным двухзначным.
        int n = 23;
        System.out.println("Целое число N является чётным двухзначным : " + (n % 100 == n && n % 2 == 0));

        // Сумма двух первых цифр заданного четырёхзнаного числа равна сумме двух его последних цифр.
        n = 1221;
        System.out.print("Сумма двух первых цифр заданного четырёхзнаного числа равна сумме двух его последних цифр : ");
        System.out.println((n / 100 % 10) + (n / 1000) == (n % 10) + (n / 10 % 10));

        // Сумма Цифр данного трёхзначного числа N является чётным числом.
        n = 133;
        System.out.print("Сумма Цифр данного трёхзначного числа N является чётным числом : ");
        System.out.println((n % 10 + n / 10 % 10 + n / 100 % 10) % 2 == 0);

        // Точка с координатами (x, y) принадлежит части плоскости, лежащей между прямыми x = m, x = n. (m < n)
        int m = 15;
        n = 24;
        int x = 17;
        System.out.print("Точки с координатами (x, y) принадлежит части плоскости, лежащей между прямыми x = m, x = n. (m < n) : ");
        System.out.println(x >= m && x <= n);

        // Квадрат данного трехзначного числа равен кубу суммы цифр этого числа.
        n = 125;
        x = n % 10 + n / 10 % 10 + n / 100 % 10;
        System.out.print("Квадрат данного трехзначного числа равен кубу суммы цифр этого числа : ");
        System.out.println(Math.pow(n, 2) == Math.pow(x ,3));

        // Треугольник со сторонами a, b, c является равнобедренным
        int a = 3;
        int b = 3;
        int c = 3;
        System.out.print("Треугольник со сторонами a, b, c является равнобедренным : ");

        // Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
        n = 123;
        int first = n / 100;
        int second = n / 10 % 10;
        int third = n % 10;
        System.out.print("Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре : ");
        System.out.println((first + second == third) || (second + third == first) || (first + third == second));

        // Заданное число N является стпению числа a (показатель степени можнт находиться в диапазоне от 0 до 4).
        n = 9;
        a = 3;
        System.out.print("Заданное число N является стпению числа a (показатель степени можнт находиться в диапазоне от 0 до 4) : ");
        System.out.println(n == 1 || n == a || n == pow(a, 2) || n == pow(a, 3) || n == pow(a, 4));

        // График функции y = ax^2 + bx + c проходит через заданную точку с координатами (m, n).
        a = 4;
        b = 3;
        c = 2;
        m = 1;
        n = 8;
        double y = a * pow(x, 2) + b * x + c;
        System.out.print("График функции y = ax^2 + bx + c проходит через заданную точку с координатами (m, n) : ");
        System.out.println(y == n);
    }
}