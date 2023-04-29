package Com.College;

public class Triangle implements Shape{

    float triangleArea,trianglePerimeter,base,height,side1,side2,side3;
    public Triangle(float base,float height,float side1,float side2,float side3) {
        this.base=base;
        this.height=height;
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public float calculteArea() {
        triangleArea= (float) (0.5*base*height);
        return triangleArea;
    }

    @Override
    public float calculatePerimeter() {
        trianglePerimeter = (float) (side1 + side2 + side3);
        return trianglePerimeter;
    }
}