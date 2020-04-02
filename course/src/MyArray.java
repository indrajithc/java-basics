package course.src;

import java.util.Scanner;

public class MyArray {
   static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
       String[] names= new String[10];
       for ( int o= 0; o< 10; o++) {
           System.out.print("Enter name " + ( o + 1 ) + " : ");
           names[o] = scanner.nextLine();
       }
       System.out.println("\n\nSaved names are \n");
       for ( int o= 0; o< 10; o++) {
           System.out.println("Name " + ( o + 1 ) + " " + names[o]);
       }
   }
}