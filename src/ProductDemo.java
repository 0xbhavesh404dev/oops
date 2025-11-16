class Product {
    private int productId;
    private String productName;
    private double price;
    public Product(int Id, String n, double p) {
        productId =Id ;
        productName=n ;
        price = p;
    }


    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }


    public boolean isPriceAbove(double thre) {
        return price > thre;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Smartphone", 29999);
        p1.displayDetails();
        System.out.println("Is price above ₹25000? " + p1.isPriceAbove(25000));
    }
}