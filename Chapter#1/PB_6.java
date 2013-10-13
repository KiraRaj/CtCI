package Chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/12/13
 * Time: 8:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB_6 {

    public static void setRowZero(int[][] matrix, int m){

        int rowLength = matrix[0].length;

        for(int i=0; i<rowLength; i++){
            matrix[m][i] = 0;
        }
    }

    public static void setColumn(int[][] matrix, int n){

        int columnLength = matrix.length;

        for(int i=0; i<columnLength; i++){
            matrix[i][n] = 0;
        }
    }

    public static void searchForZero(int[][] matrix, int r, int c){

        boolean[] judgeRow = new boolean[r];
        boolean[] judgeCol = new boolean[c];

        System.out.println(judgeCol[1]);

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j] == 0){
                    judgeRow[i] = true;
                    judgeCol[j] = true;
                }
            }
        }

        for(int i=0; i<r; i++){
            if(judgeRow[i] == true)
                setRowZero(matrix,i);
        }

        for(int j=0; j<c; j++){
            if(judgeCol[j] == true)
                setColumn(matrix,j);
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(matrix[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,0,11,12}};
        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(matrix[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(r + "   " + c);

        searchForZero(matrix, r, c);
        System.out.println();


    }
}
