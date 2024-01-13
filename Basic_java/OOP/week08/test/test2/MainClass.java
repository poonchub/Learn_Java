package week08.test.test2;

public class MainClass {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[3];

        geometries[0] = new Triangle(4);
        geometries[1] = new Square(5);
        geometries[2] = new Circle(6);
        
        printDetail(geometries);
    }

    public static void printDetail(Geometry [] geometries){
        for (int i = 0 ; i < geometries.length ; i++){
            geometries[i].getGeoType();
            System.out.println("Length: "+(int)(geometries[i].getLength()));
            geometries[i].calculatePerimiter();
            geometries[i].calculateArea();

            if (i != geometries.length-1){
                System.out.println();
            }
        }
    }
}
