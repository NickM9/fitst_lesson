package by.epam.first_lesson.branch;

/*
Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
Определить пройдёт ли кирпич через отверстие.
 */

public class BranchThirtyOne {
    public static void main(String[] args) {
        int A = 2;
        int B = 3;

        int x = 3;
        int y = 6;
        int z = 1;

        if (((A >= x && B >= y) || (A >= y && B >= x)) ||
                ((A >= x && B >= z) || (A >= z && B >= x)) ||
                ((A >= y && B >= z) || (A >= z && B >= y)))
            System.out.println("Кирпич влезет");
        else
            System.out.println("Кирпич не влезет");
    }
}
