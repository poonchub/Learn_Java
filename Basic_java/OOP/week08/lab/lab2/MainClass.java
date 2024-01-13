package week08.lab.lab2;
public class MainClass {
    public static void main(String[] args) {
        
        Geometry [] geometries = new Geometry[3];
        geometries[0] = new Triangle(4);
        geometries[1] = new Square(5);
        geometries[2] = new Circle(6);

        printDetails(geometries);
    }

    public static void printDetails(Geometry []geometries){
        for (int i = 0 ; i < geometries.length ; i++){
            geometries[i].getGeoType();
            geometries[i].printLength();
            geometries[i].printPerimeter();
            geometries[i].printArea();

            if (i<geometries.length-1){
                System.out.println();
            }
        }
    } 
}
