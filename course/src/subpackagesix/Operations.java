package course.src.subpackagesix;

public interface Operations {

    int sum( int x, int y);

    int GetX();

    default void display() {
        System.out.println( GetX() );   
    }

    static void displayText() {
        System.out.println("Static interface");
    }

}