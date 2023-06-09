package Week2;

public class ArrayOp {

    public static void main(String[] args) {
        int numbers[] = new int[]{55,32,45,98,82,11,9,39,50};
        int smallestnum = numbers[0];
        int largestnum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestnum)
                largestnum = numbers[i];
            else if (numbers[i] < smallestnum)
                smallestnum = numbers[i];
        }

        System.out.println("Largest Number is : " + largestnum);
        System.out.println("Smallest Number is : " + smallestnum);
    }
}
