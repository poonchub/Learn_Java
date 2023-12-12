import java.util.*;
public class GetAndPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Scanner kb = new Scanner(System.in);
        String []listIncome = new String[20];
        String []listExpense = new String[20];
        int count = 0;
        int status = 1;
        double moneyIncome = 0, moneyExpense = 0;
        do{
            System.out.print("Option: ");
            char option = sc.next().charAt(0);
            if (option=='+'){
                System.out.print("List: ");
                listIncome[count] = sc.next();

                System.out.print("Amount of money: ");
                moneyIncome += kb.nextDouble();
            }
            else if (option=='-'){
                System.out.print("List: ");
                listExpense[count] = sc.next();

                System.out.print("Amount of money: ");
                moneyExpense += kb.nextDouble();
            }
            else if (option=='0'){
                status = 0;
            }
            else {
                System.out.println("Invalid option");
            }
        }while (status==1);

        summary(moneyIncome,moneyExpense);
    }

    public static void summary(double moneyIncome, double moneyExpense){
        double balance = 1000.00;
        System.out.printf("Amount of income: %.1f\n",moneyIncome);
        System.out.printf("Amount of expense: %.1f\n",moneyExpense);
        System.out.printf("Remaining balance: %.1f Baht",(balance+moneyIncome-moneyExpense));
    }
}
