package week07.test.test3;

public class MainClass {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("BMW", "Black", "2022", "Z4", "Roadster");
        vehicles[1] = new Aeroplane("Boeing", "White", "2012", "787", "Jet");
        vehicles[2] = new ElectricCar("Tasla", "Gray", "2021", "S", "Sedan", "100 KWh");
        
        for (int i = 0 ; i < vehicles.length ; i++){
            vehicles[i].printDetails();
        }
    }
}
