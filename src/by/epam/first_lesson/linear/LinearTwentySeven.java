package by.epam.first_lesson.linear;

/*
Дано значение а. Не используя никаких функций и никаких операций, кроме умножения,
получить значение a^8 за три операции и a ^ 10 за четыре.
 */

public class LinearTwentySeven {
    public static void main(String[] args) {

        int a = 2;

        a *= a;
        a *= a;
        a *= a;

        System.out.println("Восьмая степень за три операции: " + a);

        a *= a;

        System.out.println("Десятая степень за четыре операции: " + a);

//        for (int i = 1; i <= 4; i++){
//
//            a *= a;
//
//            if (i == 3){
//                System.out.println("Восьмая степень за три операции: " + a);
//            }
//
//        }
//
//        System.out.println("Десятая степень за четыре операции: " + a);
    }
}
