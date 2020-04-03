package course.src.subpackagefour;

public class MyThread extends Thread {
    boolean isRunning = true;
     @Override
    public void run() {

        int count = 0;
        while( isRunning ) {
            System.out.println(count);
            count ++;
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
    
}