package course.src.subpackagesix;
 

public class MyClass {

    public static void main(String[] args) {
        
        // MyRunnable myRunnable =  new MyRunnable();

        Runnable newRunnable = ()-> {
            System.out.println("Thread is working new way");
        };
        Thread thread = new Thread(newRunnable);
        thread.start();
    }
 
}