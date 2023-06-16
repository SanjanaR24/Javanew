package week3;

import static week3.SumThreads.a;
import static week3.SumThreads.partialSums;

class PartialSumCalculator implements Runnable {
    int threadId,startIndex, endIndex;

    public PartialSumCalculator(int threadId, int startIndex, int endIndex) {
        this.threadId = threadId;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += a[i];
        }

        partialSums[threadId] = sum;

    }
}
