import java.util.Scanner;

public class A15_ForLoop {
    public static void main(String[] args) {
        /*
        For Loop
            for (เงื่อนไข) {
                statement;
            }
        */

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i++){
            System.err.println(i);
        }
    }
}
