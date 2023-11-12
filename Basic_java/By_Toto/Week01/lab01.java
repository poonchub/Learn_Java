package Basic_java.By_Toto.Week01;

public class lab01 {
    public static void main(String[] args) {
        
        // การเรียกใช้ class
        Student student01 = new Student();
        Student student02 = new Student();

        Student.age = 20;

        // การ input ค่าเข้า
        student01.firstName = "Poonchub";
        student01.setLastName("Nanawan");
        student01.age =  15;
        student01.score = 70;

        student02.firstName = "Reda";
        student02.setLastName("Kaaea");
        student01.age =  17;
        student01.score = 60;

        // การเรียกใช้งาน
        student01.display();
        student02.display();
        
    }
}
