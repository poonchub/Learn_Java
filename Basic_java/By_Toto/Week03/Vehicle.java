package Basic_java.By_Toto.Week03;

public class Vehicle {
    
    private String color;       // ไม่สืบทอด

    public String brand;

    String model;

    protected Double price;

    public void move(){
        System.out.println("Vehicle move");
    }

    public void  repair(){

    }

    // constructure
    public Vehicle(){
        System.out.println("call class Vehicle");
    }

    //Encapsolution
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
