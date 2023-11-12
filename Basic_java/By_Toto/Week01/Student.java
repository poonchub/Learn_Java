package Basic_java.By_Toto.Week01;

// การสร้าง class ใช้เอง
public class Student {
    
    // การประกาศตัวแปร
    String firstName;       // ตัวแปร instance (ใช้ตัวแปรแยกกัน)
    private String lastName;
    Integer score;

    static Integer age;     // ตัวแปร static (ใช้ตัวแปรร่วมกัน)

    // public
    // private
    // protected

    public void display(){

        System.out.println("\nFirstname = "+firstName);
        System.out.println("Lastname = "+lastName);
        System.out.println("Age = "+age);
        

    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getGrade(){
        if(score >= 80){
            return "A";
        }
        else if (score >= 70){
            return "B";
        }
        else if (score >= 60){
            return "C";
        }
        else if (score >= 50){
            return "D";
        }
        else {
            return "F";
        }
    }

    // overloading
    public Integer setAge(Integer year){
        System.out.println("set age by integer year");
        return 0;
    }
    public Float setAge(Float year){
        System.out.println("set age by float year");
        return 0.f;
    }
    public Integer setAge(Integer year, Integer month){
        System.out.println("set age by integer year and integer month");
        return 0;
    }
}
