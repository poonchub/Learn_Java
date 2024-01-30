package week11.test.test1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int num1, num2;
        int[] arr1 = { 20, 40, 45, 60, 75, 90 };
        int[] arr2 = { 1, 2, 0, 5, 3 };

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter num1: ");
            num1 = sc.nextInt();
        
            System.out.print("Enter num2: ");
            num2 = sc.nextInt();

            System.out.println(arr1[num1] + " / " + arr2[num2] + " = " + arr1[num1] / arr2[num2]);
        }
        catch (ArithmeticException ex){
            // System.out.println(ex.getMessage());    // แสดงคำอธิบาย
            // System.out.println(ex);                 // แสดงชื่อปัญหา และคำอธิบาย
            // ex.printStackTrace();                   // แสดงชื่อปัญหา คำอธิบาย และที่อยู่
            System.out.println("Exception occured: "+ex);
            System.out.println("Division by zero is not allowed.");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception occured: "+ex);
            System.out.println("The number you entered exceeds the size of the array.");
        }
        catch (InputMismatchException ex){
            System.out.println("Exception occured: "+ex);
            System.out.println("The index must be an integer.");
        }

        sc.close();
    }
}
