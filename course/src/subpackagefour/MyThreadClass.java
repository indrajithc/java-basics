package course.src.subpackagefour;

public class MyThreadClass {

    public static void main(String[] args) {
        System.out.println("Thread example");

        MyThread myThread = new MyThread();
        myThread.start();

        try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
        
        myThread.isRunning = false;
       
    }
}