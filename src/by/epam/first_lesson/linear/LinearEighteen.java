package by.epam.first_lesson.linear;

// Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба

public class LinearEighteen {

	public static void main(String[] args) {
		int a = 2;
		
		double areaEdge = a * a;
		double areaFull = 6 * areaEdge;
		double volume = Math.pow(a, 3);
		
		System.out.println("Area of Edge = " + areaEdge );
		System.out.println("Full Area = " + areaFull);
		System.out.println("Volume = " + volume);
	}

}
