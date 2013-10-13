package Chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/11/13
 * Time: 8:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB_5 {

    public static void rotateMatrix(int[][] matrix, int n){

        int[][] newMatrix = new int[n][n];

        int[][] layers = new int[n][n];

        for(int i=0; i<n; i++){
            layers[i] = matrix[i];
        }

        int lay = n-1;

        for(int c=0; c<n; c++){
            for(int r=0; r<n; r++){
                newMatrix[r][c] = layers[lay][r];
            }
            lay--;
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(newMatrix[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();

        rotateMatrix(matrix,n);

    }
}
