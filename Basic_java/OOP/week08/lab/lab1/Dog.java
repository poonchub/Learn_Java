package week08.lab.lab1;

public class Dog extends Animal{
    
    public Dog(String name, String gender, int age, String colour){
        super(name, gender, age, colour);
    }

    public void makeNoise(){
        System.out.println(getName()+" is barking.");
    }
}
