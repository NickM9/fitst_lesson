package by.epam.first_lesson.linear;

/*
Составить программу для вычисления пути, пройденного лодкой, если её скорость в стоячей воде v км/ч
скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки t2 ч.
 */

public class LinearThirtyOne {
    public static void main(String[] args) {
        int v = 7;
        int v1 = 2;
        int t1 = 1;
        int t2 = 2;

        double s = t1 * v + t2 * (v - v1);

        System.out.println(s);
    }
}
