package course.src.mainpackage;

import java.util.Calendar;
import java.util.Scanner;

public class findAge {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("Enter year of birth");
        int birthYear = scanner.nextInt();
        System.out.println("Your age is : " + ( currentYear - birthYear));
    }
}