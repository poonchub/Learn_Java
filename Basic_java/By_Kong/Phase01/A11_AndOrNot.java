import java.util.Scanner;

public class A11_AndOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();

        if (num1>=0 && num2>=0){
            System.out.println("number1 and number2 >= 0");
        }
        else if (num1>=0 || num2>=0){
            System.out.println("number1 or number2 >= 0");
        }
        else {
            System.out.println("number1 and number2 < 0");
        }
    }
}
