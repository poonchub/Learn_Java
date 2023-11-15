package Basic_java.By_Kong.Phase02;

public class B01_Array {
    public static void main(String[] args) {
        /*
        Array แบบ Primitive Data Type
            การสร้าง array
                type[] arrayName = new type[ขนาด];
                type[] arrayName = {สมาชิก,...};

            การเปลี่ยนค่าสมาชิก
                arrayName[index] = new value;

            การนับจำนวนสมาชิก
                type variableName = arrayName.length;
        */

        // แบบกำหนดขนาดไว้
        int[] number1 = new int[4];

        // กำหนดค่าลงไป
        number1[0] = 5;
        number1[1] = 10;
        number1[2] = 15;
        number1[3] = 20;

        // แบบกำหนดสมาชิก
        int[] number2 = {1,2,3,4,5};

        // เปลี่ยนค่าสมาชิก 
        number2[3] = 100;

        // นับจำนวนสมาชิก
        int count = number2.length;
        
        // เข้าถึงสมาชิกด้วย For Loop
        System.out.print("Data in number1 : ");
        for (int i=0 ; i<number1.length ; i++){
            System.out.print("\t"+number1[i]);
        }
        System.out.println("\nLength in number1 : "+number1.length);

        // การเข้าถึงสมาขิกด้วย ForEach
        System.out.print("Data in number2 : ");
        for (int data:number2){
            System.out.print("\t"+data);
        }
        System.out.println("\nLength in number2 : "+count);
    }
}
