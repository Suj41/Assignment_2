package Abstraction;

public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle( 4f);
        System.out.println("Area of Circle :"+circle.area());
        Shape triangle = new Triangle(2f, 3f);
        System.out.println("Area of Triangle :"+triangle.area());
        Shape rectangle= new Rectangle(3f,4f);
        System.out.println("Area of Rectangle :"+rectangle.area());
    }
}
