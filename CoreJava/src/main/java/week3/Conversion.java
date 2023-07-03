package main.java.week3;

public class Conversion extends Exception{
    public void conversiontoInt(String s){
    try {
        int i = Integer.parseInt(s);
        System.out.println("Output:"+i);
    }
        catch(NumberFormatException ne)
    {
        System.out.println("Exception: Number Format Exception");
       // System.out.println(ne);

    }

}
}
