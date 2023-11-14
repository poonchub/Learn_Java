public class A12_TernaryOperator {
    public static void main(String[] args) {
        /*
        Ternary Operator
            ตัวแปร = เงื่อนไข ? คำสั่งเมื่อเงื่อนไขเป็นจริง : คำสั่งเมื่อเงื่อนไขเป็นเท็จ;
        */

        int num = 10;

        String result = "";

        result = num%2==0 ? num+" = even number" : num+" = odd number";

        System.out.println(result);
    }
}
