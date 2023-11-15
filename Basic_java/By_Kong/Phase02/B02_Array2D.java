package Basic_java.By_Kong.Phase02;

public class B02_Array2D {
    public static void main(String[] args) {
        /*
        Array 2D
            type[row][column] arrayName = {
                {array1},
                {array2},
                ...,
                {arrayN}
            };
        */
        String[][] product = {
            {"Aa","Ab","Ac"},
            {"Ba","Bb","Bc"},
            {"Ca","Cb","Cc"}
        };

        // การเข้าถึงสมาชิก
        for (int i=0 ; i<product.length ; i++){
            for (int j=0 ; j<product[i].length ; j++){
                System.out.println(product[i][j]);
            }
        }
    }
}
