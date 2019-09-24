package by.epam.first_lesson.linear;
/*
 * Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSс.
 */

public class LinearTwentyTwo {

	public static void main(String[] args) {
		
		int t = 4581;
		
		int h = t / 3600;
        int m = (t - h * 3600) / 60;
        int s = t - (h*3600) - (m*60);
        
        System.out.println(h + "ч " + m + "мин " + s + "с");
	}

}
