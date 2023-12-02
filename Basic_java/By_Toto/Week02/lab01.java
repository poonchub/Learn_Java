package Basic_java.By_Toto.Week02;

public class lab01 {
    public static void main(String[] args) {
        
        String A = "1";
        String B = "1";

        String a = new String("Name1");
        String b = new String("Name1");
        
        // การเช็คความเท่ากัน
        System.out.println(A==B);   // ไม่แนะนำ
        System.out.println(a==b);   // ไม่แนะนำ

        System.out.println(a.equals(b));    // แนะนำ

    }
}
