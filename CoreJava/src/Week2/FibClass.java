package Week2;
public class FibClass {
    int num1 = 0, num2 = 1, sum=0,N=10;
int count=2;
    public void fibList() {
        System.out.println(num1+"\n"+num2);
        while (count<N) {
            sum = num1 + num2; //sum=1
            System.out.println(sum+ "");
            num1 = num2; //num2=0 //num1=
            num2 = sum;
            count++;

        }
    }
}
