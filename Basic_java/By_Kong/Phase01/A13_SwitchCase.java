import java.util.Scanner;
public class A13_SwitchCase {
    public static void main(String[] args) {
        /*
        Switch Case
            switch (เงื่อนไข) {
                case ค่าที่ 1 :
                    คำสั่งที่ 1 ;
                    break;
                case ค่าที่ 2 :
                    คำสั่งที่ 2 ;
                    break;
                    ...
                case ค่าที่ N :
                    คำสั่งที่ N ;
                    break;
                default : 
                    คำสั่งเมื่อไม่มีค่าที่ตรงกับที่ระบุใน case;
            }
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Day number : ");
        int n = sc.nextInt();
        sc.close();

        String name;

        switch (n){
            case 1 :
                name = "Sunday";
                break;
            case 2 :
                name = "Monday";
                break;
            case 3 :
                name = "Tuesday";
                break;
            case 4 :
                name = "Wednesday";
                break;
            case 5 :
                name = "Thursday";
                break;
            case 6 :
                name = "Friday";
            case 7 :
                name = "Saturday";
            default :
                name = "Don't have";
        }
        System.out.println("It is "+name);
    }
}
