package week09.test.test3;

public class Employee extends Person implements Payment{
    final String occupation;
    private int hour;
    private int day;
    private double rate;

    Employee(String name, String gender, String occupation, double rate) {
        super(name, gender);
        this.occupation = occupation;
        this.rate = rate;
    }

    public double calculateSalary(){
        return hour*day*rate;
    }

    public String getOccupation(){
        return occupation;
    }

    public void getDetails() {
        System.out.println("Occupation: " + occupation);
        System.out.println("Salary: "+calculateSalary());
    }
    
    public int getHour(){
        return hour;
    } 
    public void setHour(int hour){
        this.hour = hour;
    }

    public int getDay(){
        return day;
    } 
    public void setDay(int day){
        this.day = day;
    }

    public double getRate(){
        return rate;
    } 
    public void setRate(double rate){
        this.rate = rate;
    }
}
