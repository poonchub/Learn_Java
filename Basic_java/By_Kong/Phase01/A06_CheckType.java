public class A06_CheckType {
    public static void main(String[] args){
        String a = "Are";

        /*
        เช็คขนิดข้อข้อมูล true or false
            boolean result = ตัวแปรที่ต้องการเช็ค instanceof ชนิดข้อมลที่ต้องการตรวจสอบ;
        */

        boolean result = a instanceof String;
        System.out.println(result);

    }
}
