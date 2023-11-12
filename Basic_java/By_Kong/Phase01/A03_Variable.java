public class A03_Variable {
    public static void main(String[] args) {
        /*
        การนิยามตัวแปร
            ชนิดข้อมูล ชื่อตัวแปร;
            ชนิดข้อมูล ชื่อตัวแปร = ค่าเริ่มต้น;
            ชนิดข้อมูล ชื่อตัวแปร = ค่าเริ่มต้น, ชื่อตัวแปร = ค่าเริ่มต้น;
        */

        // Global Variable
        int number1 = 10;       // แบบระบุค่าเริ่มต้น
        boolean status = true;
        char alphabet = 'A';
        float number2 = 20.5f;        
        double number3 = 20.5;

        System.out.println("Number1 = "+number1);
        System.out.println("Status = "+status);
        System.out.println("Alphabet = "+alphabet);
        System.out.println("Number2 = "+number2);
        System.out.println("Number3 = "+number3);

        // Local Variable
        {
            /*
            การนิยามค่าคงที่
            final ชนิดข้อมูล ชื่อตัวแปร;
            */
            final int NUMBER = 50;
            System.out.println("NUMBER = "+NUMBER);
        }

        /*
        การหาจำนวนค่าที่สามารถเก็บได้ ของแต่ละชนิดข้อมูล
            System.out.println(ชนิดข้อมูล.MIN_VALUE);
            System.out.println(ชนิดข้อมูล.MAX_VALUE);
        */
        System.out.println("Integer min Value = "+Integer.MIN_VALUE);
        System.out.println("Integer max Value = "+Integer.MAX_VALUE);
        
    }
}
