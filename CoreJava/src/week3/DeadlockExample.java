package week3;

public class DeadlockExample{
    public static void main(String args[]) {
        final String Resource1 = "Apple juice";
        final String Resource2 = "Mango juice";

        Thread thread1 = new Thread() {
            public void run() {
                System.out.println("Starting Resource1"+Resource1);

                synchronized(Resource1) {
                    System.out.println("1st thread - locked 1st string");
                    try {
                        Thread.sleep(100);

                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    synchronized(Resource2) {
                        System.out.println("1st thread - locked 2nd string ");
                    }
                }
                System.out.println("no deadlock");
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                System.out.println("Starting Resource 2"+Resource2);

                synchronized(Resource2) {
                    System.out.println("2nd thread - locked 2nd string ");
                    try {
                        Thread.sleep(100);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    synchronized(Resource1) {
                        System.out.println("2nd thread - locked 1st string ");
                    }
                }
                System.out.println("no deadlock");
            }
        };
        thread1.start();
        thread2.start();
    }
}