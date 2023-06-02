import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cse cse=new Cse();
        System.out.println("Enter Department Size");
        Scanner sc= new Scanner(System.in);
        int depSize=sc.nextInt();
       // int depSize=cse.getDepartmenSize(250);
        System.out.println("Department Size is:"+depSize);
        }
    }