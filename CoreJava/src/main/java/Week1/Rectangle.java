package main.java.Week1;


public class Rectangle implements Area, Perimeter {
    float area;
    @Override
    public int calculateArea(int l, int b) {
        int area=l*b;
return area;
    }
    public int calculatePerimeter(int l, int b){
      int Perimeter=2*(l+b);
        return Perimeter;
    }
}
