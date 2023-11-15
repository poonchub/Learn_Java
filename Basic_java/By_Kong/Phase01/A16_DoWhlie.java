import java.util.Scanner;

public class A16_DoWhlie {
    public static void main(String[] args) {
        /*
        Do...While
            do {
                statement;
            }
            while (เงื่อนไข);
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count = 1;
        do {
            System.out.println(count);
            count++;
        } while (count<=n);
    }
}
