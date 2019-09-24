package by.epam.first_lesson.linear;

/*
Текущее показание электронных часов: m ч (0 <= m <= 23) n min (0 <= n <= 59)
k с (0 <=0 <= 59). Какое время будут показывать часы через p ч q мин r с.
 */

public class LinearThirtyTwo {
    public static void main(String[] args) {
        int h = 2; // время текущее
        int m= 51;
        int s = 56;

        int plusH = 23;  // время прибавленное
        int plusM = 32;
        int plusS = 5;

        int resS = s + plusS;  // новое время
        int resM = m + plusM;
        int resH = h + plusH;

        if (resS >= 60) {
            resS -= 60;
            resM++;
        }

        if (resM >= 60){
            resM -= 60;
            resH++;
        }

        if (resH >= 24){
            resH -= 24;
        }

        System.out.println(resH + " : " + resM + " : " + resS);
    }
}
