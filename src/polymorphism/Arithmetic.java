package polymorphism;

public class Arithmetic {
    static int add(int f, int s){
        return f+s;
    }
    static float add(float f, int s){
        return f+s;
    }
    static float add(int f, float s){
        return f+s;
    }
    static float add(float f, float s){
        return f+s;
    }
    static double add(double f, int s){
        return f+s;
    }
    static double add(int f, double s){
        return f+s;
    }
    public static void main(String[] args) {
        int result = add(1,2);
        System.out.println(result);
        System.out.println(add(1.5f, 2));
        System.out.println(add(1, 2.5f));
        System.out.println(add(1.5f, 2.5f));
    }
}
