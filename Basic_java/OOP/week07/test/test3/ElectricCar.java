package Basic_java.OOP.week07.test.test3;

public class ElectricCar extends Vehicle{
    private String battery;
    private String bodyStyle;

    public ElectricCar(String brand, String colour, String year, String model, String bodyStyle, String battery){
        super(brand, colour, year, model);
        this.battery = battery;
        this.bodyStyle = bodyStyle;
    }

    public void printDetails(){
        System.out.println("Vehicle: ElectricCar");
        super.printDetails();
        System.out.println("Body Style: "+bodyStyle);
        System.out.println("Battery Capacity: "+battery);
        System.out.println();
    }
}
