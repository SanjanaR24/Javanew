package main.java.Week2;
        public class arrayRotation{
            public static void main(String[] args) {
                    int array[]=new int[]{1,3,45,78,32,89};
                    int k=2;
                        int n=array.length;
                        int temp[]=new int[k];
                        for(int i=0;i<k;i++)
                            temp[i]=array[i];
                        for(int i=0;i<(n-k);i++)
                            array[i]=array[k+i];
                        for(int i=n-k;i<n;i++)
                            array[i]=temp[i-(n-k)];
                        for(int i=0;i<array.length;i++)
                        System.out.println(array[i]);
            }
        }
