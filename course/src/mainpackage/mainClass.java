package course.src.mainpackage;

import java.util.Scanner;

public class mainClass {
    static Scanner scanner = new Scanner(System.in);
    static Scanner reader = new Scanner(System.in);
    public static void main( String [] args) {
        
        System.out.print("\n Enter name : "); 
        String name = scanner.nextLine();
        System.out.print("Enter age : ");
        int age = scanner.nextInt();
        System.out.print("Enter Salary : ");
        double salary = scanner.nextDouble();
        System.out.print("Enter Gender : ");
        String tempInput = reader.nextLine();
        char gender = tempInput.charAt(0);

        System.out.println("\n\n Your details ");
        System.out.println(" ------------------------------- ");
        System.out.println("Name  : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Salary  : " + salary);
        System.out.println("Gender  : " + gender);


    }
}