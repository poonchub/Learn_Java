public class A05_String {
    public static void main(String[] args) {
        /*
        String คือ ชนิดข้อมูลที่เก็บชุดข้อความ
        symbol = " "

        Character คือ ขนิดข้อมูลที่เก็บตัวอักษร
        symbol = ' '
        */

        char a = 'A';
        // char b = 'ABC';      error
        String b = "ABC";

        System.out.println("Character = "+a);
        System.out.println("String = "+b);

        /*
        การแปลง String เป็น Integer
            ชนิดข้อมูล ตัวแปรใหม่ = Integer.parseInt("string");

        การแปลง Integer เป็น String
            ชนิดข้อมูล ตัวแปรใหม่ = String.valueOf(integer);

        (แปลงเป็น type อิ่นก็ทำคล้ายกัน)
        */
        String numString1 = "100";
        int numInt1 = Integer.parseInt(numString1);
        numInt1 += 30;
        System.out.println(numInt1);

        String numString2 = String.valueOf(numInt1);
        System.out.println(numString2);
    }
}
