package by.epam.first_lesson.branch;

/*
Даны три точки A(x1, y1), B(x2, y2), C(x3, y3). Определить будут ли они расположены на одной прямой.
 */

public class BranchTwentyNine {
    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 8;

        int x2 = -2;
        int y2 = -7;

        int x3 = -4;
        int y3 = -17;

        if (((x1 - x3) * (y2 - y3) - (x2- x3) * (y1 - y3)) / 2 == 0){
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }
    }
}
