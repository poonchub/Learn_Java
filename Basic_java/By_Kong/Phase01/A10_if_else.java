import java.util.Scanner;

public class A10_if_else {
    public static void main(String[] args){
        /*
        if (เงื่อนไข){
            statement;
        }
        else if (เงื่อนไข){
            statement;
        }
        else {
            statement;
        }
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        sc.close();

        if (num1>num2){
            System.out.println("number1 > number2");
        }
        else if (num1<num2){
            System.out.println("number1 < number2");
        }
        else{
            System.out.println("number1 = number2");
        }
        
    }
}
