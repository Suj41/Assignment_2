package polymorphism;

public class Shape {
    public float area(float r){
        return 3.14f*r*r;
    }
    public  int area (int l, int b){
        return l*b;
    }
    public float area (int b, float h){
        return b*h/2f;
    }
}
