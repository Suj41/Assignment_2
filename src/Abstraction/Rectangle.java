package Abstraction;

public  class Rectangle extends Shape {
    private float length;
    private float breadth;
     public  Rectangle(float length, float breadth){
       this.breadth=breadth;
       this.length= length;
     }

     @Override
    protected float area(){
         return length*breadth;
     }
}
