package by.epam.first_lesson.linear;

// Вывести любой символ и определить его порядковый номер, а так же указать предыдущий и последующий символы

public class LinearThirtyThree {
    public static void main(String[] args) {
        char x = 'f';
        byte z = (byte) x;

        System.out.println("Порядковый номер символа " + x + " : " + z);
        System.out.println("Предыдущий символ : " + (char) (z-1) + " : " + (z-1));
        System.out.println("Следующий символ : " + (char) (z+1) + " : " + (z+1));
    }
}
