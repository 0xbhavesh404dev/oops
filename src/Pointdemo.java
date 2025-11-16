class Point {
    private int x;
    private int y;


    public Point(int a, int b) {
        x = a;
        y = b;
    }


    public Point(Point other) {
        x = other.x;
        y = other.y;
    }


    public void displayCoordinates() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }
}

public class Pointdemo {
    public static void main(String[] args) {
        Point pt1 = new Point(5, 7);
        Point pt2 = new Point(pt1);

        System.out.print("Original Point: ");
        pt1.displayCoordinates();

        System.out.print("Copied Point: ");
        pt2.displayCoordinates();
    }
}