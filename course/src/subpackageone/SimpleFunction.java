package course.src.subpackageone;

import java.util.Scanner;

public class SimpleFunction {
    static Scanner scanner = new Scanner( System.in );


    static double recursion ( int number ) {
        double result = 1;
        if( number > 1 ) {
            result = recursion(number - 1); 
            return  result * number;
        }
        return result;
    }

    public static void main(String[] args) {
        
        int number = 0;

        System.out.println("Recursion example");
        
        System.out.print("Enter an integer : ");
        number = scanner.nextInt();

        double result = recursion( number);
        System.out.println("Result : " + result);

    }
}   