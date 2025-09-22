abstract class Figure {
    double dim1, dim2;
    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract double getArea();
}

class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    double getArea() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    double getArea() {
        return 0.5 * dim1 * dim2;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Figure f1 = new Rectangle(5, 10);
        Figure f2 = new Triangle(6, 8);

        System.out.println("Rectangle Area: " + f1.getArea());
        System.out.println("Triangle Area: " + f2.getArea());
    }
}
