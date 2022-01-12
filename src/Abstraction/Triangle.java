package Abstraction;

public class Triangle extends Shape{
    private float base;
    private float height;

    public Triangle(float base, float height){
        this.base= base;
        this.height=height;
    }
    @Override
    protected float area(){
        return 0.5f*base*height;
    }
}
