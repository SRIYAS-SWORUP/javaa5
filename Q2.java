class Figure {
    double dim1, dim2;
    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    double area() {
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

class Square extends Figure {
    Square(double dim1) {
        super(dim1, dim1);
    }
    double area() {
        return dim1 * dim1;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Figure f1 = new Rectangle(5, 10);
        Figure f2 = new Triangle(6, 8);
        Figure f3 = new Square(4);

        System.out.println("Rectangle Area: " + f1.area());
        System.out.println("Triangle Area: " + f2.area());
        System.out.println("Square Area: " + f3.area());
    }
}
