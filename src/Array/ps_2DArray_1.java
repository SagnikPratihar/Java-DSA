package Array;

import java.util.Scanner;

public class ps_2DArray_1 {
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Q1
    static int[][] transpose(int[][]a,int r1,int c1){
        int[][] ans=new int[c1][r1];
        for(int i=0;i<c1;i++){
            for(int j=0;j<r1;j++){
                ans[i][j]=a[j][i];
            }
        }
    return ans;
    }

    //By the below method we can only get the transpose of square matrix.
    static void transposeInOnePlace(int[][]a,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                //swap
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }

    //Q2
    static void swapInArray(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseArray2(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateMatrix(int [][]a,int r,int c){
        //transpose
        transpose(a,r,c);

        //reverse
        int n=a.length;
        for(int i=0;i<n;i++){
            reverseArray2(a[i]);
        }

    }

    //Q3
    static int[][] pascal(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            //ith row column ha i+1 columns
            ans[i]=new int[i+1];
            //1st and last element in every row is 1
            ans[i][0]=ans[i][i]=1;

            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;

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
        //Write s program to display transpose of matrix entered by user.
        System.out.println("Input matrix");
        printArray(a);

        System.out.println("Transpose of matrix");
        int[][] ans=transpose(a,r1,c1);
        printArray(ans);

        System.out.println("Transpose of matrix in place");
        transposeInOnePlace(a,r1,c1);
        printArray(a);


        //Q2
        //Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space.
        //Hint: first make transpose of the given array then reverse each row of the transposed array.
        rotateMatrix(a,r1,c1);
        System.out.println("Matrix rotated by 90 degree is ");
        printArray(a);

        //Q3
        //Given an integer n return the first n rows of pascal's triangle. In pascal's triangle, each number is the sum of the two number is the sum of two numbers directly above it as shown:
        /*
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
       */
        System.out.println("Enter n");
        int n=sc.nextInt();
        int[][] ans1=pascal(n);
        printArray(ans1);





    }
}
