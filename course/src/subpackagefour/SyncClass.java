package course.src.subpackagefour;

public class SyncClass extends Thread {
    boolean isRunning = true;
    static String name = "";

    public SyncClass ( String name ) {
        this.name = name;
    }

     @Override
    public void run() {
        display();
    }

    synchronized static void display () {

        int count = 0;
        while( count < 10 ) {
            System.out.println( "[ " + name + " ]" + count);
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