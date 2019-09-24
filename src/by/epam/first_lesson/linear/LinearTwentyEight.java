package by.epam.first_lesson.linear;

// Составить программу перевода радианной меры угла в градусы, минты и секунды

public class LinearTwentyEight {
    public static void main(String[] args) {

        double x = 2500;

        double deg = Math.toDegrees(x);
        double min = deg * 60;
        double sec = min * 3600;

        System.out.println("Degrees: " + deg);
        System.out.println("Minutes: " + min);
        System.out.println("Seconds: " + sec);
    }
}
