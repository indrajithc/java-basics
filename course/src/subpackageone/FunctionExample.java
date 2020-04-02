package course.src.subpackageone;


class WorkingClass {
    static int numberOfObject = 0;

    WorkingClass () {
        System.out.println("Objet created");
        numberOfObject++;
    }
    
    WorkingClass ( String input ) {
        System.out.println("Objet created with input : " + input);
        numberOfObject++;
    }

    void displayObjectCount () {
        System.out.println( numberOfObject + " object/s created");
    }

    int sum( int number1, int number2 ) {
        return number1 + number2;
    }
    
    int sum( int number1, int number2, int number3 ) {
        return number1 + number2 + number3;
    }
    

}


public class FunctionExample {
    
    public static void main(String[] args) {
        System.out.println("Function with separate class");
        
        WorkingClass workingClass = new WorkingClass();
        WorkingClass workingClassNew = new WorkingClass("Test data");
        workingClass.displayObjectCount();
        workingClassNew.displayObjectCount();
        new WorkingClass().displayObjectCount();

        System.out.println("Sum of 10 and 12 is " + workingClass.sum(10, 12));
        System.out.println("Sum of 10 12 and 22 is " + workingClass.sum(10, 12, 22));
    }
}