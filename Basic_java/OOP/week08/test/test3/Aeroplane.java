package week08.test.test3;

public class Aeroplane extends Vehicle{
    private String propulsion;

    public Aeroplane(String brand, String colour, String year, String model, String propulsion){
        super(brand, colour, year, model);
        this.propulsion = propulsion;
    }

    public void printDetails(){
        System.out.println("Vehicle: Aeroplane");
        super.printDetails();
        System.out.println("Propulsion: "+propulsion);
        System.out.println();
    }
}
