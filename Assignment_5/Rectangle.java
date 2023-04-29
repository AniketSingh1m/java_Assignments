package Com.College;

public class Rectangle implements Shape{
    float rectangleArea,rectanglePerimeter,width,length;
    public Rectangle(float width,float length) {
        this.width=width;
        this.length=length;
    }

    @Override
    public float calculteArea() {
        rectangleArea= (float) (width*length);
        return rectangleArea;
    }

    @Override
    public float calculatePerimeter() {
        rectanglePerimeter=(float)(2*(length+width));
        return rectanglePerimeter;
    }
}
