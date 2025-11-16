class Rectangle {
    private double length;
    private double breadth;


    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }


    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area + " sq units");
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12.5, 8.0);
        r1.calculateArea();
    }
}