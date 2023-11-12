public class A04_TypeConvertion {
    public static void main(String[] args){
        /*
        การแปลงชนิดข้อมูล
            1. Widening Casting
                คือ การแปลงข้อมูลที่มีขนาดเล็กไปสู่ข้อมูลขนาดใหญ่(แบบอัตโนมัติ)
                byte-> short-> char-> int-> long-> float-> double
            2. Narrowing Casting
                คือ การแปลงข้อมูลที่มีขนาดใหญ่ไปสู่ข้อมูลขนาดเล็ก(แบบไม่อัตโนมัติ)
                double-> float-> long-> int-> char-> short-> byte
        */

        // Widening Casting
        int numInt1 = 10;
        double numDouble1 = numInt1;

        System.out.println(numInt1);
        System.out.println(numDouble1);

        // Narrowing Casting
        double numDouble2 = 20.0;
        int numInt2 = (int)numDouble2;      // ทำการระบุ type ข้างหน้า
        System.out.println(numDouble2);
        System.out.println(numInt2);
    }
}
