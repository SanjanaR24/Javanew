package week3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SumThreads {
    static int size = 100, count = 5;

    public static int[] a = new int[size];
    public static int[] partialSums = new int[count];

    public static void main(String[] args) {
        for (int i = 0; i < size; i++) {
            a[i] = i + 1;
        }
        ExecutorService executor = Executors.newFixedThreadPool(count);
        for (int i = 0; i < count; i++) {
            int startIndex = i * (size / count);
            int endIndex = startIndex + (size / count);
            executor.execute(new PartialSumCalculator(i, startIndex, endIndex));
        }
        executor.shutdown();
        int finalSum = 0;
        for (int sum : partialSums) {
            finalSum += sum;
        }

        System.out.println("Final sum: " + finalSum);
    }

}