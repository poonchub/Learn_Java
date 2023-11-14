import java.util.Scanner;   // import class

public class A07_Scaner {
    public static void main(String[] args){
        /*
        การรับข้อมูลจากแป้นพิมพ์
            ต้อง import class Scanner เข้ามาทำงาน
                import java.util.Scanner;

            ประกาศใช้งาน class
                Scanner ชื่อตัวแปรคลาส = new Scanner(รูปแบบ input);

            รับค่าไปเก็บ
                ชนิดข้อมูล ชื่อตัวแปร = ชื่อตัวแปรคลาส.next___();
                
                .next()         รับค่าเป็น string จากแป้นพิมพ์(ไม่รวมช่องว่าง)
                .nextLine()     รับค่าเป็น string จากแป้นพิมพ์ทั้งบรรทัด(รวมช่องว่าง)
                .nextInt()      รับค่าเป็น int
                .nextFloat()    รับค่าเป็น float
                .nextDouble()   รับค่าเป็น double

        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name = ");
        String name = sc.nextLine();
        System.out.print("Enter your age = ");
        int age = sc.nextInt();

        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
    }
}
