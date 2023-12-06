package week02.lab.lab03;
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input a five-digit integer: ");
        int n = sc.nextInt();
        
        int x1 = n%10;
        int x2 = (n/10)%10;
        int x3 = (n/100)%10;
        int x4 = (n/1000)%10;
        int x5 = n/10000;

        int sum = x1+x2+x3+x4+x5;

        System.out.println("The sum of all digits in "+n+" is "+sum);

    }
}
