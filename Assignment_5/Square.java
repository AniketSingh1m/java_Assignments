package Com.College;

public class Square implements Shape{
    float squareArea,squarePerimeter,side;
    public Square(float side) {
        this.side=side;
    }

    @Override
    public float calculteArea() {
        squareArea= (float) (Math.pow(side,2));
        return squareArea;
    }

    @Override
    public float calculatePerimeter() {
        squarePerimeter=(float)(4*side);
        return squarePerimeter;
    }
}
