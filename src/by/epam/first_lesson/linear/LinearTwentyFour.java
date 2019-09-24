package by.epam.first_lesson.linear;

// Найти площадь равнобедренной трапеции с основаниями a и b и углом a при большем основании a.

public class LinearTwentyFour {

	public static void main(String[] args) {
		double a = 2;
		double b = 3;
		double q = 45;
		q = Math.toRadians(q);
		
		double h = Math.abs(a-b) / 2 * Math.sin(q) / Math.cos(q);
		double s = (a + b) / 2 * h;
		
		System.out.print("Area = " + s);
	}

}
