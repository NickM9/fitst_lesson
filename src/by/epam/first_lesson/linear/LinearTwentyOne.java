package by.epam.first_lesson.linear;

/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class LinearTwentyOne {

	public static void main(String[] args) {
		
		double  r = 222.333;
		
		double firstNew = r * 1000 % 1000;
		double secondNew = (int) r % 1000;
		
		double res = firstNew + secondNew / 1000;
		
		System.out.println(res);
	}

}
