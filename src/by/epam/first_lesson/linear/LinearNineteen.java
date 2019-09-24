package by.epam.first_lesson.linear;

/*
 * Дана сторона равностороннего треугольника. Найти площадь этого треугольника,
 * его высоту, радиусы вписанной и описанной окружности. 
 */

public class LinearNineteen {

	public static void main(String[] args) {
		
		int a = 4;
		
		double h = a * Math.sqrt(3) / 2;
		double s = a * h / 2;
		
		double rv = a * Math.sqrt(3) / 6;
		double ro = a * Math.sqrt(3) / 3;
		
		System.out.println("h = " + h);
		System.out.println("s = " + s);
		System.out.println("rv = " + rv);
		System.out.println("ro = " + ro);
		
	}

}
