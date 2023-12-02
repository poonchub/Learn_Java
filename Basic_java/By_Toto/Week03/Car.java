package Basic_java.By_Toto.Week03;

public class Car extends Vehicle {
    
    private String carType;

    // Constructure
    public Car(){
        System.out.println("call class Car");
    }

    public Car(String name){
        super();    // การอ้างถึง class แม่ หรือเรียก method ใน class แม่
    }

    // Overriding การเขียนทับ method ใน class แม่
    public void move(){
        System.out.println("Car move");
    }

}
