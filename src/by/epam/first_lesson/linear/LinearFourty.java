package by.epam.first_lesson.linear;

// Дано значение x. Получить значения -2x + 3x^2 - 4x^3 и 1 + 2x + 3x^2 + 4x^3. Позаботьтесь об экономии операций.

public class LinearFourty {
    public static void main(String[] args) {
        int x = 2;

        // first -2x + 3x^2 - 4x^3
        int res1 = x * (-2 + x * (3 + 4 * x));

        // second 1 + 2x + 3x^2 + 4x^3
        int res2 = 1 + x * (2 + x * (3 + 4 * x));

        System.out.println(res1 + "\n" + res2);
    }
}
