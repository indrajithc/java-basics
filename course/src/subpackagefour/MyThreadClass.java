package course.src.subpackagefour;

public class MyThreadClass {

    public static void main(String[] args) {
        System.out.println("Thread example");

        MyThread myThread = new MyThread("T");
        MyThread myThread1 = new MyThread("X");
        MyThread myThread2 = new MyThread("Y");
        myThread.start();
        myThread1.start();
        myThread2.start();

        try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
        
        myThread.isRunning = false;

        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
        myThread1.isRunning = false;
        myThread2.isRunning = false;
        myThread.isRunning = true; // not worked
        
       
    }
}