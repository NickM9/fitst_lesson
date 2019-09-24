package by.epam.first_lesson.linear;

// Найти произведение цифр заданного четырехзначного числа
public class LinearSixteen {

	public static void main(String[] args) {
		
		int x = 1835;
		int res = 0;
		int tmp;
		
		for (int i = 0; i < 4; i++) {
			tmp = x % 10;
			res += tmp;
			x /= 10;
		}
		
		System.out.println(res);
	}

}
