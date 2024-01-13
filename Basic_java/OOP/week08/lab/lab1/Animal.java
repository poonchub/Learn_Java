package week08.lab.lab1;

public class Animal {
    private String name;
    private String gender;
    private int age;
    private String colour;
    private String food;

    public Animal(){
        System.out.println("A new "+getClass().getSimpleName()+" object is created.");
    }

    public Animal(String name, String gender, int age, String colour){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.colour = colour;
        System.out.println("A "+age+"-year-old "+colour+" "+gender+" "+getClass().getSimpleName()+" objact named \""+name+"\" is created");
    }

    public void makeNoise(){
        System.out.println(name+" is making noise.");
    }

    public void eat(String food){
        this.food = food;
        System.out.println(name+" is eating "+food+".");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getFood(){
        return food;
    }

    public void setFood(String food){
        this.food = food;
    }
}
