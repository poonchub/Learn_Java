package week08.lab.lab2;

import java.text.DecimalFormat;

public class Geometry {
    private double length;
    private double perimeter;
    private double area;

    public Geometry(double length) {
        this.length = length;
    }

    public double calculatePerimeter(){
        return perimeter;
    }

    public double calculateArea(){
        return area;
    }

    public void getGeoType(){
        System.out.println("This is a "+getClass().getSimpleName());
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }

    public void printPerimeter(){
        DecimalFormat def = new DecimalFormat("#.#");
        System.out.println("Perimeter: "+def.format(calculatePerimeter()));
    }

    public void printArea(){
        DecimalFormat def = new DecimalFormat("#.##");
        System.out.println("Area: "+def.format(calculateArea()));
    }

    public void printLength(){
        DecimalFormat def = new DecimalFormat("#.#");
        System.out.println("Length: "+def.format(length));
    }

}