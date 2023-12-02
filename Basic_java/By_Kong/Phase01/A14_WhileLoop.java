import java.util.Scanner;

public class A14_WhileLoop {
    public static void main(String[] args) {
        /*
        While Loop
            While (เงื่อนไข) {
                statement;
            }

            break       ออกจาก Loop ทันที
            continue    ออกจาก Loop ปัจจุบัน แล้วเข้าสู้ Loop ถัดไป
        */

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int count = 1 ;

        while (count<=n){
            System.out.println(count);
            count++;
        }
    }
}
