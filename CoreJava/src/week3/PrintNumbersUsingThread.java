package week3;
//Write a program to create a thread by extending Thread class. Thread should print numbers from 1 to 10.
public class PrintNumbersUsingThread extends Thread{
  public void run(){

      for(int i=1;i<=10;i++){
          System.out.print(i+" ");
      }
      System.out.println();
  }
}
