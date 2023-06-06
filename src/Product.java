package Week1.src;

public class Product {
    double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
public double getPrice(int quantity)
        {
            return quantity*price;
        }
    }

