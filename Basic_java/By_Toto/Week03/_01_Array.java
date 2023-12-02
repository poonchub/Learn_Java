package Basic_java.By_Toto.Week03;

public class _01_Array {
    public static void main(String[] args) {
        String word2d[][] = {{"a","b","c"},{"d","e"}};

        System.out.println("Use for");
        for (int i=0 ; i<word2d.length ; i++){
            for (int j=0 ; j<word2d[i].length ; j++){
                System.out.println(word2d[i][j]);
            }
            System.out.println("--------------------");
        }
        
        System.out.println("Use foreach");
        for (String row[] : word2d){
            for (String word : row){
                System.out.println(word);
            }
            System.out.println("--------------------");
        }

    }
}
