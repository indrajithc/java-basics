package course.src.subpackagefour;

public class MyRunnableClass {

    public static void main(String[] args) {
        System.out.println("Thread example");

        MyRunnable MyRunnable = new MyRunnable("T");
        Thread thread = new Thread( MyRunnable);
        thread.start();

        try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
        
        MyRunnable.isRunning = false;
 
       
    }
}