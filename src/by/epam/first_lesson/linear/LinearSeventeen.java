package by.epam.first_lesson.linear;

//Даны два числа. Найдите среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

public class LinearSeventeen {
	
	public static void main(String[] args) {
		
		int first = 2;
		int second = -5;
		
		double cubes = (Math.pow(first, 3) + Math.pow(second, 3)) / 2;
		double modules = Math.sqrt(Math.abs(first) * Math.abs(second));
		
		System.out.println("Cubes = " + cubes);
		System.out.println("Modules = " + modules);
	}

}
