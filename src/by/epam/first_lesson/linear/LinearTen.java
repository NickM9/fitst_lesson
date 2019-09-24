package by.epam.first_lesson.linear;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * (sinX + cosY) / (cosX - sinY) * tgXY
 */

public class LinearTen {
	public static void main(String[] args) {
		
		double x = 2.3;
		x = Math.toRadians(x);
		
		double y = 3.2;
		y = Math.toRadians(y);
		
//		double res = (Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(y))) / 
//				(Math.cos(Math.toRadians(x)) - Math.sin(Math.toRadians(y))) * 
//				Math.tan(Math.toRadians(x*y));
		
		double res = (Math.sin(x) + Math.cos(y) / (Math.cos(x) - Math.sin(y) * Math.tan(x*y)));
		
		System.out.print(res);
	}
}
