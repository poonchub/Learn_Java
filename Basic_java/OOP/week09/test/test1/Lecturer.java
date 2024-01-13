package week09.test.test1;

public class Lecturer .........(7).........{
    private double salary;
    public Lecturer(String name, String gender, double salary) {
        .........(8).........;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    final public void getDetails() {
        super.getDetails();
        System.out.println("Salary: " + salary);
    }
}
