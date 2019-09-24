package by.epam.first_lesson.linear;

// Вычислить длину окружности и площадь круга одного и того же радиуса

public class LinearFourteen {

	public static void main(String[] args) {
		
		double r = 20;
		
		double c = 2 * Math.PI * r;
		double square = Math.PI * Math.pow(r, 2); 
		
		System.out.println("Length = " + c);
		System.out.println("Square = " + square);
	}

}
