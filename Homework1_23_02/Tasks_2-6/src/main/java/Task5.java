/**
 * Created by Lammi on 24.02.2016.
 */
public class Task5 {
    public static void printMatrix(int matrixLength){

        int [][] matrix = new int[matrixLength][matrixLength];
        int backward = matrixLength - 1;

        for (int i = 0; i < matrixLength ; i++){
            matrix[i][i] = 1;
            matrix[i][backward] = 1;
            backward--;

            for (int j = 0; j < matrixLength; j++){

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMatrix(9);
    }
}
