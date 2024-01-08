package week07.test.test3;

public class Car extends Vehicle{
    private String bodyStyle;

    public Car(String brand, String colour, String year, String model, String bodyStyle){
        super(brand, colour, year, model);
        this.bodyStyle = bodyStyle;
    }

    public void printDetails(){
        System.out.println("Vehicle: Car");
        super.printDetails();
        System.out.println("Body Style: "+bodyStyle);
        System.out.println();
    }
}
