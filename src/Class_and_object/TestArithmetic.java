package Class_and_object;

public class TestArithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.first=4;
        arithmetic.second=2;

        System.out.println("Sum is "+arithmetic.add());
        System.out.println("sub is "+arithmetic.sub());
        System.out.println("sub is "+arithmetic.div());


    }
}
