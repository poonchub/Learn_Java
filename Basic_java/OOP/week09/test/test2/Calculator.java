package week09.test.test2;

public class Calculator implements Operator{
    private String name;
    private String type;

    public Calculator(String name,String type){
        this.name = name;
        this.type = type;
        System.out.println("You have got a "+name+type);
    }

    public void add(double n1, double n2){
        System.out.println(name+": Add Operator");
    }

    public void subtract(double n1, double n2){
        System.out.println(name+": Subtract Operator");
    }

    public void multiply(double n1, double n2){
        System.out.println(name+": Multiply Operator");
    }
    
    public void divide(double n1, double n2){
        System.out.println(name+": Divide Operator");
    }
}
