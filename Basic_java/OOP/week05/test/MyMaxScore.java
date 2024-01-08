import java.util.*;
public class MyMaxScore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of subjects: ");
        int nfs = sc.nextInt();

        String []sub = new String[nfs];
        int []score = new int[nfs];

        if (nfs>0){
            inputSubjact(nfs, sub);
            // display(sub);
            inputScore(nfs, score);
            findMax(score, sub);
        }
        else {
            System.out.println("You are not enrolled is any courses.");
        }
        sc.close();

    }

    public static void inputSubjact(int nfs, String []sub){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        for (int i=0 ; i<nfs ; i++){
            System.out.print("Input subject: ");
            sub[i] = sc.next();
        }
        
    }

    public static void inputScore(int nfs, int []score){
        Scanner sc = new Scanner(System.in);
        for (int i=0 ; i<nfs ; i++){
            System.out.print("Input score: ");
            score[i] = sc.nextInt();
        }
    }
    
    public static void findMax(int []score, String []sub){
        double max = score[0];
        String st = "";
        for (int i=0 ; i<score.length ; i++){
            if (score[i]>max){
                max = score[i];
                st = sub[i];
            }
        }
        System.out.printf("You earn max score:\n %s: %.1f",st,max);
    }
    
    public static void display(String []sub){
        for (String item : sub){
            System.out.println(item);
        }
    }

}
