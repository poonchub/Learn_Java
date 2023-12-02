package Basic_java.By_Toto.Week03;
import java.util.Scanner;

public class _03_LabArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input lenght : ");
        int length = sc.nextInt();
        int array[] = new int[length];
        sc.close();

        for (int i=0 ; i<array.length ; i++){
            System.out.print("Number "+(i+1)+": ");
            array[i] = sc.nextInt();
        }

        System.out.println("\nOutput array");
        for (int item : array){
            System.out.print(item+"\t");
        }


    }
}
