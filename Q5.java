class Point2D {
    int x, y;
    Point2D() {
        x = 0;
        y = 0;
    }
    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void display() {
        System.out.println("X: " + x + ", Y: " + y);
    }
}

class Point3D extends Point2D {
    int z;
    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    void show() {
        System.out.println("X: " + x + ", Y: " + y + ", Z: " + z);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(3, 4);
        p2.display();

        Point3D p3 = new Point3D(5, 6, 7);
        p3.show();
    }
}
