package Basic_java.By_Kong.Assignment;
import java.util.Scanner;
public class A01_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mass(kg) : ");
        float mass = sc.nextFloat();
        System.out.print("Enter your height(m) : ");
        float height = sc.nextFloat();
        sc.close();

        float bmi = mass/(height*height);

        System.out.println("BMI = "+bmi);
    }
}
