package by.epam.first_lesson.linear;

/*
 * Заданы координаты трех вершин треугольника (x1, y1), (x2, y2), (x3, y3). Найти его периметр и площадь.
 */

public class LinearThirteen {

	public static void main(String[] args) {
		
		int x1 = 4;
		int y1 = 2;
		int x2 = 0;
		int y2 = 6;
		int x3 = -4;
		int y3 = -2;
		
		double st1 = Math.sqrt( Math.pow( (x2 - x1), 2) + Math.pow( (y2 - y1), 2) );
		double st2 = Math.sqrt( Math.pow( (x3 - x2), 2) + Math.pow( (y3 - y2), 2) );
		double st3 = Math.sqrt( Math.pow( (x1 - x3), 2) + Math.pow( (y1 - y3), 2) );
		
		double perimeter = st1 + st2 + st3;
		double poluper = perimeter / 2;
		
		double square = Math.sqrt(poluper * (poluper - st1) + (poluper - st2) + (poluper - st3));
		
		System.out.println("Perimeter = " + perimeter);
		System.out.println("Square = " + square);
		
		System.out.println(st1 + " " + st2 + " " + st3);
	}

}
