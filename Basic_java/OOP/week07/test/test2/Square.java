package Basic_java.OOP.week07.test.test2;

public class Square extends Geometry{
    public Square(double length) {
        super(length);
    }

    public void calculatePerimiter() {
        setPerimeter(4 * getLength());
        super.calculatePerimiter();
    }

    public void calculateArea() {
        setArea(Math.pow(getLength(), 2));
        super.calculateArea();
    }

    public void getGeoType() {
        System.out.println("This is a Square");
    }
}
