package Basic_java.By_Kong.Assignment;

import java.util.Scanner;

public class A02_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num1 = sc.nextInt();
        
        if (num1%2==0){
            System.out.println("Number is even number");
        }
        else {
            System.out.println("Number is odd number");
        }
    }
}
