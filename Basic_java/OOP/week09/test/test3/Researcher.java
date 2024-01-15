package week09.test.test3;

public class Researcher extends Employee implements PermanentPayment{
    
    public Researcher(String name, String gender, double rate) {
        super(name, gender, "Researcher",rate);
    }

    public double calculateSalary(){
        return hour*day*super.getRate();
    }
}
