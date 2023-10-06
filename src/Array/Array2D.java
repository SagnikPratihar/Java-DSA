package Array;

import java.util.Scanner;

public class Array2D {
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }
    }
    //Q1
    //Adding two matrices
    // Note: only matrices with same dimension can be added.
    static void add(int[][]a,int r1,int c1,int[][]b,int r2,int c2){

        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong input, addition not possible");
            return;
        }
        int[][] sum=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printArray(sum);
    }

    //Q2
    static void multiply(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(c1!=r2){
            System.out.println("Multiplication is not possible");
            return;
        }
        int[][] ans=new int[r1][c2];
        for(int i=0;i<r1;i++){ //row number
            for(int j=0;j<c2;j++){ //column number
                for(int k=0;k<c1;k++){
                    ans[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of two matrix is : ");
        printArray(ans);
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
        System.out.println("Enter number of rows and columns of matrix 2 ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] b=new int[r2][c2];
        System.out.println("Enter matrix value");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix 1");
        printArray(a);
        System.out.println("Matrix 2");
        printArray(b);

        //Q2
        //Write a program to display multiplication of two matrices entered by user.
        multiply(a,r1,c2,b,r2,c2);


        //Q3
        //Reverse each row in a matrix.



    }
}
