import java.util.*;
public class Main {
    public static void main(String[] args) {
        //System.out.printf("Hello and welcome!");
        Product p=new Product();
        System.out.printf("Enter price for each item");
        Scanner sc=new Scanner(System.in);
        double price=sc.nextDouble();
        p.setPrice(price);
        System.out.printf("Enter quantity");
        int quantity=sc.nextInt();
        double totalPrice=p.getPrice(quantity);
        System.out.println("Total price of cart is:" +totalPrice);
        }
    }
