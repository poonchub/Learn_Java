package week04.lab.lab2;

import java.util.*;

public class MatrixTransposing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns ");
        int columns = sc.nextInt();

        int[][] array1 = new int[rows][columns];
        int[][] array2 = new int[columns][rows];
        

        System.out.print("Enter the matrix value: ");
        for (int i=0 ; i<rows ; i++){
            for (int j=0 ; j<columns ; j++){
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("The initial matrix: ");
        for (int row=0 ; row<rows ; row++){
            for (int column=0 ; column<columns ; column++){
                System.out.print(array1[row][column]+"\t");
            }
            System.out.println();
        }

        // for (int i=0 ; i<rows ; i++){
        //     for (int j=0 ; j<columns ; j++){
        //         array2[j][i] = array2[i][j] ;
        //     }
        // }

        // System.out.println("The transposed matrix: ");
        // for (int row=0 ; row<columns ; row++){
        //     for (int column=0 ; column<rows ; column++){
        //         System.out.print(array2[row][column]+"\t");
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}
