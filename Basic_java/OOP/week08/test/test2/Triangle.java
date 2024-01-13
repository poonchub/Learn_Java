package week08.test.test2;

public class Triangle extends Geometry{
    
    public Triangle(double length) {
        super(length);
    }

    public void calculatePerimiter() {
        setPerimeter(3 * getLength());
        super.calculatePerimiter();
    }

    public void calculateArea() {
        setArea((Math.sqrt(3) / 4) * Math.pow(getLength(), 2));
        super.calculateArea();
    }

    public void getGeoType() {
        System.out.println("This is a Triangle");
    }
}
