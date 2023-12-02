import java.util.Scanner;

public class A09_Operetor {
    public static void main(String[] args){
        /*
        Operator(ตัวดำเนินการ)
            ตัวดำเนินการทางคณิตศาสตร์
            + , - , * , / , %

            ตัวดำเนินการเปรียบเทียบ
            == , != , > , < , >= , <=

            ตัวดำเนินการตรรกศาสตร์
            && , || , !

            ตัวดำเนินการเพิ่มค่า-ลดค่า
            ++a , a++ , --a , a--

            Compound Assignment
            += , -= , *= ,l /= , %=

        Operand(ตัวถูกดำเนินการ)
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        sc.close();

        // ตัวดำเนินการทางคณิตศาสตร์
        System.out.println("\nSum of number = "+(num1+num2));

        // ตัวดำเนินการตรรกศาสตร์
        System.out.println("\nnum1 > num2 : "+(num1>num2));
        System.out.println("num1 < num2 : "+(num1<num2));
        System.out.println("num1 = num2 : "+(num1==num2));

        // ตัวดำเนินการตรรกศาสตร์
        boolean status1 = (num1>=0);
        boolean status2 = (num2>=0);
        System.out.println("\nnum1 and num2 >= 0 "+(status1&&status2));

        /*
        ลำดับความสำคัญ
            1. ()
            2. ++ , --              ซ้ายไปขวา
            3. * , / , %            ซ้ายไปขวา
            4. + , -                ซ้ายไปขวา
            5. < , <= , > , >=      ซ้ายไปขวา
            6. == , !=              ซ้ายไปขวา
            7. &&
            8. ||
            9. = , Compound         ขวาไปซ้าย**
        */
    }
}
