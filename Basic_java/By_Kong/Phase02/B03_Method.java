package Basic_java.By_Kong.Phase02;

public class B03_Method {
    public static void main(String[] args) {

        /*
        Method 
            1. ไม่มีการรับและส่งค่า
                modifier void methodName(){
                    statement;
                }

            2. มีการรับค่า แต่ไม่ส่งค่า
                modifier void methodName(parameter1,parameter2){
                    statement;
                }
            
            3. มีการรับและส่งค่า
                modifier void methodName(parameter1,parameter2){
                    statement;
                }

            4. ไม่มีการรับค่า แต่ส่งค่า
                modifier void methodName(parameter1,parameter2){
                    statement;
                }
        */
        
        // การเรียกใช้งาน
        display();
        read("Nanawan");
        int add = add(5, 10);
        System.out.println("Add = "+add);
        System.out.println("PI = "+PI());

        }
        
        static void display(){
            System.out.println("Hello World");
        }

        static void read(String x){
            System.out.println(x);
        }

        static int add(int x, int y){
            int sum =x+y;
            return sum;
        }

        static float PI(){
            return 3.14f;
        }
}
