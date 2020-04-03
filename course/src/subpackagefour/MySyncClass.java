package course.src.subpackagefour;

public class MySyncClass {

    public static void main(String[] args) {
        System.out.println("Thread example");

        SyncClass SyncClass = new SyncClass("T");
        SyncClass SyncClass1 = new SyncClass("X");
        SyncClass SyncClass2 = new SyncClass("Y");
        SyncClass.start();
        SyncClass1.start();
        SyncClass2.start();

        try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
        
        SyncClass.isRunning = false;

        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
        SyncClass1.isRunning = false;
        SyncClass2.isRunning = false;
       
       
    }
}