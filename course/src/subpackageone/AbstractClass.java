package course.src.subpackageone;


abstract class MyClass {
    int age;

    MyClass( int age) {
        this.age = age;
    }

    void display() {
        System.out.println("Age is : " + this.age);
    }

    MyClass() {

    }
}


public class AbstractClass extends MyClass {

    public static void main(String[] args) {
        
        AbstractClass abstractClass = new AbstractClass();
        abstractClass.age = 12;
        abstractClass.display();
    }
}