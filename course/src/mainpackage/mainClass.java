package course.src.mainpackage;

import java.util.Scanner;

public class mainClass {
    static Scanner scanner = new Scanner(System.in);
    public static void main( String [] args) {
        String inputText = "";
        System.out.println("Enter something ");
        inputText = scanner.nextLine();
        System.out.println( inputText);
    }
}