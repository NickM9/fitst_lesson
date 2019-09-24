package by.epam.first_lesson.linear;

/*
 * Найти площадь кольца, внутренний радиус которого равен r,  а внешний R (R > r)
 */

public class LinearTwentyThree {

	public static void main(String[] args) {
		
		int r = 5;
		int R = 10;
		
		double s = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
		
		System.out.print("Area = " + s);

	}

}
