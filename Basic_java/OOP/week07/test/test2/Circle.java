package week07.test.test2;

public class Circle extends Geometry{
    public Circle(double radius) {
        super(radius);
    }

    public void calculatePerimiter() {
        setPerimeter(2 * Math.PI * getLength());
        super.calculatePerimiter();
    }

    public void calculateArea() {
        setArea(Math.PI * Math.pow(getLength(), 2));
        super.calculateArea();
    }

    public void getGeoType() {
        System.out.println("This is a Circle");
    }
}
