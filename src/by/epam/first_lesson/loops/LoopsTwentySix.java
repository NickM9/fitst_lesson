package by.epam.first_lesson.loops;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти конмпьютера (Таблица ASCII)

public class LoopsTwentySix {
    public static void main(String[] args) {

        for (int i = 0; i <= 127; i++){

            System.out.println(i + " | " + (char) i);

        }

    }
}
