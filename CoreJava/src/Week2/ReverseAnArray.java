package Week2;

public class ReverseAnArray {
    public static void main(String[] args){
        int originalArray[]={2,45,6,98,32,1,67};
        //System.out.println("in for loop");
        int l=originalArray.length;
        int reversedArray[]=new int[l];
        for(int i=l-1,j=0;i>=0;i--,j++) {
            //System.out.println("in for loop");
                reversedArray[j] = originalArray[i];
                System.out.print(reversedArray[j]+" ");
        }
    }
    //System.out.println(reversedArray[j]);
}
