package course.src.subpackagefour;

public class Deadlock {
  // incomplete
    public static void main(final String[] args) {
        System.out.println("Deadlock example");

        final String user1 = "Stranger 1";
        final String user2 = "Stranger 2";
        Thread  app1 = new Thread() {

            @Override
            public void run() {
                synchronized (user1) {
                    System.out.println("App 1 is locked user 1 ");
                    try {
                        Thread.sleep(1000);
                    } catch (final Exception e) {
                        //TODO: handle exception
                        synchronized ( user2) {
                            System.out.println(" App 1 is locked user 1");
                        }
                    }
                }
            }
        };

        Thread  app2 = new Thread() {

            @Override
            public void run() {
                synchronized (user2) {
                    System.out.println("App 2 is locked user 2 ");
                    try {
                        Thread.sleep(1000);
                    } catch (final Exception e) {
                        //TODO: handle exception
                        synchronized ( user1) {
                            System.out.println(" App 2 is locked user 2");
                        }
                    }
                }
            }
        };

        app1.start();
        app2.start();

    }
}