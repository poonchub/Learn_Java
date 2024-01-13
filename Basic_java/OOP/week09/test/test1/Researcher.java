package week09.test.test1;

public class Researcher extends .........(9).........{
    private double salary;
    public Researcher(String name, String gender, double salary) {
        .........(10).........;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void getDetails() {
        System.out.println("Occupation: " + super.getOccupation() + "\nSalary: " + salary);
    }
}
