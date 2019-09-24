package by.epam.first_lesson.linear;

// Дана величина A, выражающая объём информации в байтах. Перевести A в более крупные единицы измерения информации.

public class LinearThirtyFour {
    public static void main(String[] args) {
        double a = 200_000_000;

        a /= 1024;
        System.out.println("Kbyte : " + a);

        a /= 1024;
        System.out.println("Mbyte : " + a);

        a /= 1024;
        System.out.println("Gbyte : " + a);

        a /= 1024;
        System.out.println("Tbyte : " + a);
    }
}
