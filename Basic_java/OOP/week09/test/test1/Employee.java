package week09.test.test1;

public class Employee extends .........(5).........{
    private final String occupation;
    Employee(String name, String gender, String occupation) {
        .........(6).........;
        this.occupation = occupation;
    }
    public String getOccupation() {
        return occupation;
    }
    public void getDetails() {
        System.out.println("Occupation: " + occupation);
    }
}
