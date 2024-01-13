package week08.lab.lab1;

public class Cat extends Animal{

    public Cat(String name, String gender, int age, String colour){
        super(name, gender, age, colour);
    }

    public void makeNoise(){
        System.out.println(getName()+" is meowing.");
    }
}
