package week08.test.test2;

public class Geometry {
    private double length;
    private double perimeter;
    private double area;

    public Geometry(){

    }

    public Geometry(double length){
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        this.area = area;
    }

    public void calculatePerimiter(){
        System.out.println("Perimeter: "+getPerimeter());
    }

    public void calculateArea(){
        System.out.println("Area: "+getArea());
    }

    public void getGeoType() {
        
    }
}
