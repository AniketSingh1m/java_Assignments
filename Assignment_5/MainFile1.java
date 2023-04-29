package Com.College;

// Name: Aniket Singh
// PRN: 21070126013
// Batch: AIML-A1
/* Objective: Implement the generic Shapes class as an interface s so that we can
implement concrete classes like circle, triangle, rectangle class from it.*/

import java.util.*;
public class MainFile1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of radius for a Circle: ");
        float rad = sc.nextFloat();
        Circle c=new Circle(rad);
        c.calculteArea();
        c.calculatePerimeter();
        System.out.println("Area of circle:"+c.circleArea+" "+"Circumference of circle:"+c.circlePerimeter);
        //square
        System.out.print("Enter value of side of a Square: ");
        float side = sc.nextFloat();
        Square s=new Square(side);
        s.calculteArea();
        s.calculatePerimeter();
        System.out.println("Area of Square:"+s.squareArea+" "+"Perimeter of Square: "+s.squarePerimeter);
        //Rectangle
        System.out.print("Enter value of width of a Rectangle: ");
        float width = sc.nextFloat();
        System.out.println();
        System.out.print("Enter value of length of a Rectangle: ");
        float length = sc.nextFloat();
        Rectangle r=new Rectangle(width,length);
        r.calculteArea();
        r.calculatePerimeter();
        System.out.println("Area of Rectangle:"+r.rectangleArea+" "+"Perimeter of Rectangle: "+r.rectanglePerimeter);
        //triangle
        System.out.print("Enter value of base of a Triangle: ");
        float base = sc.nextFloat();
        System.out.print("Enter value of height of a Triangle: ");
        float height = sc.nextFloat();
        System.out.print("Enter value of 3 sides of a Triangle: ");
        float side1 = sc.nextFloat();
        float side2 = sc.nextFloat();
        float side3 = sc.nextFloat();
        Triangle t=new Triangle(base,height,side1,side2,side3);
        t.calculteArea();
        t.calculatePerimeter();
        System.out.println("Area of Triangle:"+t.triangleArea+" "+"Perimeter of Triangle: "+t.trianglePerimeter);

    }
}
