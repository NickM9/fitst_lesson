package by.epam.first_lesson.linear;

// Три сопротивления R1, R2, R3 соеденены праллельно. Найдите сопротивление соединения.

public class LinearThirty {
    public static void main(String[] args) {

        double r1 = 200;
        double r2 = 300;
        double r3 = 500;

        double res = 1 / (1/r1 + 1/r2 + 1/r3);

        System.out.println("Сопротивление соединения = " + res);
    }
}
