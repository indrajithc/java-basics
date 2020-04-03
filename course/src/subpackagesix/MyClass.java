package course.src.subpackagesix;
 

public class MyClass {

    public static void main(String[] args) {
        
        MyRunnable myRunnable =  new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
 
}