package week02.lab.lab02;
import java.util.Scanner;
import java.lang.Math;


public class Hypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        double a = sc.nextDouble();
        System.out.print("Enter b : ");
        double b = sc.nextDouble();

        double c = Math.sqrt((a*a)+(b*b));

        System.out.println("The hypotenuse c is "+c);
    }
}
