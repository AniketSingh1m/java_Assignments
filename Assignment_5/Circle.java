package Com.College;

import java.util.*;
public class Circle implements Shape{
    Scanner sc= new Scanner(System.in);
    float circleArea,circlePerimeter,rad;
    public Circle(float rad) {
        this.rad=rad;
    }

    @Override
    public float calculteArea() {
        circleArea= (float) (pi*Math.pow(rad,2));
        return circleArea;
    }

    @Override
    public float calculatePerimeter() {
        circlePerimeter=(float)(2*pi*rad);
        return circlePerimeter;
    }
}

