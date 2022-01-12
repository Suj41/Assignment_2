package polymorphism;

public class Test extends Shape{
    public static void main(String[] args) {
        Circle circle= new Circle();
        Rectangle rect= new Rectangle();
        Triangle Tri= new Triangle();
        System.out.println("Area of Circle: "+circle.area(3f)+"cm^2");
        System.out.println("Area of Rectangle: "+rect.area(3, 4)+"cm^2");
        System.out.println("Area of Triangle: "+Tri.area(2, 3f)+"cm^2");
    }
}
