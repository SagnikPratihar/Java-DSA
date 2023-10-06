package Array;

import java.util.Scanner;

public class ps_2DArray_2 {
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Q1
    static void printSpiralOrder(int[][]a,int r,int c){
        int topRow=0, bottomRow=r-1,leftColumn=0,rightColumn=c-1;
        int totalElements =0;
        while(totalElements<r*c){
            //top row -> left column to right column
            for(int j=leftColumn;j<=rightColumn && totalElements<r*c;j++){
                System.out.print(a[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            //right column -> top row to bottom row
            for(int j=topRow;j<=bottomRow && totalElements<r*c;j++){
                System.out.print(a[j][rightColumn]+" ");
                totalElements++;
            }
            rightColumn--;
            //bottom row -> right column to left column
            for(int j=rightColumn;j>=leftColumn && totalElements<r*c;j--){
                System.out.print(a[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            //left column -> bottom row to top row
            for(int j=bottomRow;j>=topRow && totalElements<r*c;j--){
                System.out.print(a[j][leftColumn]+" ");
                totalElements++;
            }
            leftColumn++;
        }
    }

    //Q2
    static int[][] generateSpiral(int n){
        int[][] matrix=new int[n][n];
        int topRow=0, bottomRow=n-1,leftColumn=0,rightColumn=n-1;
        int current=1;
        while(current<=n*n){
            //top row -> left column to right column
            for(int j=leftColumn;j<=rightColumn && current<=n*n;j++){
                matrix[topRow][j]=current++;

            }
            topRow++;
            //right column -> top row to bottom row
            for(int j=topRow;j<=bottomRow && current<=n*n;j++){
               matrix[j][rightColumn] = current++;
            }
            rightColumn--;
            //bottom row -> right column to left column
            for(int j=rightColumn;j>=leftColumn && current<=n*n;j--){
                matrix[bottomRow][j] = current++;
            }
            bottomRow--;
            //left column -> bottom row to top row
            for(int j=bottomRow;j>=topRow && current<=n*n;j--){
                matrix[j][leftColumn] = current++;
            }
            leftColumn++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Input elements in 2D array.
        System.out.println("Enter number of rows and columns of matrix 1 ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] a=new int[r1][c1];
        System.out.println("Enter matrix value");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }


        //Q1
        //Given an n*m matrix 'a', return all elements of the matrix in spiral order.
        printSpiralOrder(a,r1,c1);


        //Q2
        //Given a positive integer n, generate an n*n matrix filled with elements from 1 to n^2 in spiral order.
        System.out.println("Input the value of n: ");
        int n=sc.nextInt();
        int[][] matrix=generateSpiral(n);
        printArray(matrix);
    }
}
