package by.epam.first_lesson.linear;

/*
 * Вычислить значение выражения по формуле (все значения принимают действительные значения)
 * (b + sqrt(b^2 + 4ac) ) / 2a - a^3 * c + b^-2
 */

public class LinearEight {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = 3.2;
		
		double res = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.print(res);
	}

}
