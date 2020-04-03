package course.src.subpackagetwo;

import java.util.Scanner;

public class Exceptions {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        try {
            int x = scanner.nextInt();
            System.out.println("Integer is :" + x);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Invalid input "+e.getMessage());
        } finally {
            System.out.println("Finally block ");
        }
        System.out.println("End of method");
    }
}