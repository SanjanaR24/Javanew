package week3;

public class PrintNumUsingRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=10;i++)
            System.out.print(i+" ");
        System.out.println();
    }

}
