package week09.test.test3;

final public class Lecturer extends Employee implements PermanentPayment{

    public Lecturer(String name, String gender, double rate) {
        super(name, gender,"Lecturer",rate);
    }

    public double calculateSalary(){
        return hour*day*super.getRate();
    }

}
