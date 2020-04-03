package course.src.subpackagefour;

public class MyThread extends Thread {
    boolean isRunning = true;
    String name = "";

    public MyThread ( String name ) {
        this.name = name;
    }

     @Override
    public void run() {

        int count = 0;
        while( isRunning && count < 20 ) {
            System.out.println( "[ " + name + " ]" + count);
            count ++;
            try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
    
}