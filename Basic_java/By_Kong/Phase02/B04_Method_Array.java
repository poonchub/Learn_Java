package Basic_java.By_Kong.Phase02;

public class B04_Method_Array {
    public static void main(String[] args) {
        /*
        Method รับค่า Array
            modifier void methodName(type[] arrName){
                statement;
            }
        */

        int [] A = {1,3,5,7,9};
        int [] B = {2,4,6,8,10};

        // การเรียกใช้งาน
        System.out.print("Data in array A = ");
        display(A);
        System.out.println("Max value in array B = "+max(B));
        System.out.println("Max index in array B = "+maxIndex(B));
        System.out.println("Result = "+compareArray(A, B));

        

    }
    
    // method แสดงค่าใน array
    static void display(int [] x){
        for (int i=0 ; i<x.length ; i++){
            System.out.print("\t"+x[i]);
        }
        System.out.println("\n--------------------------");
    }

    // method หาค่าสูงสุดใน array
    static int max(int [] x){
        int max = x[0];
        for (int i=0 ; i<x.length ; i++){
            if (x[i]>max){
                max = x[i];
            }
        }
        return max;
    }

    // method หา index ของค่าสูงสุดใน array
    static int maxIndex(int [] x){
        int maxIndex = 0;
        for (int i=1 ; i<x.length ; i++){
            if (x[i]>x[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // method เปรียบเทียบ array
    static boolean compareArray(int [] x, int y []){
        
        if (x.length == y.length){
            for (int i=0 ; i<x.length ; i++){
                if (x[i]!=y[i]){
                    return false;
                }
                
            }
            return true;
        }
        else {
            return false;
        }
    }

    // method สลับค่า array
    static void swapArray(int [] x, int y, int z){
        int temp = x[y];
        x[y] = x[z];
        x[z] = temp;
    }

}
