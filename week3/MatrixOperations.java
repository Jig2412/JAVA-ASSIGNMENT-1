import java.util.Scanner;
public class MatrixOperations {
    static int[] rowSums(int[][] matrix){
        int [] result = new int[matrix.length];
        
        for(int row = 0;row<matrix.length;row++){
            int sum = 0;
            for(int col = 0;col<matrix[row].length;col++){
                sum+=matrix[row][col];
            }
            result[row]=sum;
        }
        return result;
    }
    static int[] columnSums(int[][] matrix){
        int [] result = new int[matrix.length];
        
        for(int col = 0;col<matrix[0].length;col++){
        int sum = 0;
            for(int row = 0;row<matrix.length;row++){
                sum+=matrix[row][col];
            }
            result[col]=sum;
        }
        return result;
    }
    static int[][] add(int[][] first, int[][] second){

        int[][] result = new int[first.length][first[0].length];
        for(int row = 0;row<first.length;row++){
            for(int col = 0;col<first[0].length;col++){
                result[row][col]=first[row][col]+second[row][col];
            }
        }
        return result;

    }
    static int[][] transpose(int[][] matrix) {

    int[][] result = new int[matrix[0].length][matrix.length];

    for (int row =0;row<matrix.length;row++) {
        for (int col=0;col<matrix[row].length;col++) {
            result[col][row] = matrix[row][col];
        }
    }

    return result;
}
    static int[][] multiply(int[][] first, int[][] second){

        int[][] result = new int[first.length][second[0].length];
        for(int row = 0;row<first.length;row++){
            for(int col = 0;col<second[0].length;col++){
                for (int k = 0; k < second.length; k++) {
                result[row][col]+=first[row][k]*second[k][col];
                }
            }
        }
        return result;

    }
    static void printMatrix(int[][] matrix) {

    for (int row=0;row<matrix.length;row++) {
        for (int col=0;col<matrix[row].length;col++) {
            System.out.print(matrix[row][col] + " ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {

    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6}
    };

    System.out.println("Matrix:");
    printMatrix(matrix);

    System.out.println("Row sums:");
    int[] rows = rowSums(matrix);
    for (int i = 0; i < rows.length; i++) {
        System.out.print(rows[i] + " ");
    }

    System.out.println("\nColumn sums:");
    int[] columns = columnSums(matrix);
    for (int i = 0; i < columns.length; i++) {
        System.out.print(columns[i] + " ");
    }

    System.out.println("\nTranspose:");
    printMatrix(transpose(matrix));

    int[][] first = {
        {1, 2},
        {3, 4}
    };

    int[][] second = {
        {5, 6},
        {7, 8}
    };

    System.out.println("\nMultiplication:");
    printMatrix(multiply(first, second));
    System.out.println("\nAdd:");
    printMatrix(add(first, second));

}
}
