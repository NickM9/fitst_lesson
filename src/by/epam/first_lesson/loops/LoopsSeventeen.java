package by.epam.first_lesson.loops;

// Даны действительное (а) и натуральнок(n). Вычислить a * (a+1)...(a+n-1).

public class LoopsSeventeen {
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        int res = a;

        for (int i = 1; i <= n-1; i++){
            res *= (a+i);
            System.out.println("i = " + i + " res = " + res);
        }

        System.out.println(res);
    }
}
