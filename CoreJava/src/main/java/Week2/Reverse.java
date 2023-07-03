package main.java.Week2;
public class Reverse {
    int num=12345;
   int remainder=0;
   int reverse=0;
    void reverseNum(){
//      while(num!=0) {
//          remainder = num % 10;
//          reverse = reverse * 10 + remainder;
//          num = num / 10;
//      }
    for(;num!=0;num/=10){
          remainder = num % 10;
          reverse = reverse * 10 + remainder;
      }
        System.out.println("reverse number is:"+reverse);

    }
}
