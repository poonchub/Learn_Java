package Basic_java.OOP.week03.lab.lab2;
import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        double number = sc.nextDouble();
        int numCheck = (int)number;
        String check1, check2, check3;
        check1 = check2 = check3 = "";
        sc.close();
        
        if (number==0){
            check2 = "even";
            check3 = "integer number.";
            System.out.println(number+" is the "+check2+" "+check3);
        }
        else if (number>0){
            check1 = "positive";
            if (numCheck%2==0){
                check2 = "even";
                if (number-numCheck==0){
                    check3 = "integer number.";
                }
                else {
                    check3 = "real number.";
                }
            }
            else {
                check2 = "odd";
                if (number-numCheck==0){
                    check3 = "integer number.";
                }
                else {
                    check3 = "real number.";
                }
            }
            System.out.println(number+" is the "+check1+" "+check2+" "+check3);
        }
        else {
            check1 = "negative";
            if (numCheck%2==0){
                check2 = "even";
                if (number-numCheck==0){
                    check3 = "integer number.";
                }
                else {
                    check3 = "real number.";
                }
            }
            else {
                check2 = "odd";
                if (number-numCheck==0){
                    check3 = "integer number.";
                }
                else {
                    check3 = "real number.";
                }
            }
            System.out.println(number+" is the "+check1+" "+check2+" "+check3);
        }
    }
}
