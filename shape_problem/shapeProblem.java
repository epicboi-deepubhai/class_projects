package class_projects.shape_problem;

import java.util.*;

abstract class shape
{
    abstract float area();
    
    abstract float perimeter();
    
    abstract void disp();
}

class rect extends shape
{
    float length;
    float breadth;
    Scanner input;
    
    rect() {
        this.input = new Scanner(System.in);
        System.out.println("Enter: length: ");
        final int nextInt = this.input.nextInt();
        this.length = (float)nextInt;
        this.breadth = (float)nextInt;
    }
    
    rect(final Float n, final float breadth) {
        this.input = new Scanner(System.in);
        this.length = n;
        this.breadth = breadth;
    }
    
    public float area() {
        return this.length * this.breadth;
    }
    
    public float perimeter() {
        return 2.0f * (this.length + this.breadth);
    }
    
    public void disp() {
        System.out.println("Length and Breadth of the rectangle: " + this.length + " " + this.breadth);
        System.out.println("Area of the rectangle: " + this.area());
        System.out.println("Perimeter of the rectangle: " + this.perimeter());
    }
}

class cuboid extends shape
{
    float length;
    float breadth;
    float height;
    
    cuboid(final float length, final float breadth, final float height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
    public float area() {
        return 2.0f * (this.length * this.breadth + this.breadth * this.height + this.height * this.length);
    }
    
    public float perimeter() {
        return 4.0f * (this.length + this.breadth + this.height);
    }
    
    public float volume() {
        return this.length * this.breadth * this.height;
    }
    
    public void disp() {
        System.out.println("Length, Height and Breadth of the cuboid: " + this.length + " " + this.height + " " + this.breadth);
        System.out.println("Area of the cuboid: " + this.area());
        System.out.println("Volume of the cuboid: " + this.volume());
    }
}


class shapeProblem
{
    public static void main(final String[] array) {
        final rect rect = new rect();
        final cuboid cuboid = new cuboid(9.5f, 6.7f, 10.2f);
        rect.disp();
        cuboid.disp();
    }
}


