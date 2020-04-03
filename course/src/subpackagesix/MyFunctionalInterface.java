package course.src.subpackagesix;

class MyExample  implements FunctionalInterface {
    public void play() {
        System.out.println("Called in side myExample class");
    }
}

public class MyFunctionalInterface {
    
    public static void main(String[] args) {
        

        // Lambda expression
        FunctionalInterface functionalInterface = ()-> {
            System.out.println("Functional interface in called");
        };

        MyExample myExample = new MyExample();

        myExample.play();
    }
 
}