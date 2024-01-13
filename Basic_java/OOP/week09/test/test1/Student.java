package week09.test.test1;

public class Student extends .........(11)......... {
    private final String id;
    Student(String name, String gender, String id) {
        .........(12).........;
        this.id = id;
    }
    
    public String getID() {
        return id;
    }
    
    public void getDetails() {
        System.out.println("Student ID: " + id);
    }
}
