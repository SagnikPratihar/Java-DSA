package Array;

import java.util.Scanner;

public class ps_2DArray_3 {

    //Q1
    //Method 1
    static int sum(int[][]a,int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=a[i][j];
            }
        }
        return sum;
    }

    //Method 2
    static void findPrefixSumMatrix(int[][]a){
        int r=a.length;
        int c=a[0].length;

        //traverse horizontally to calculate row wise prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                a[i][j]+=a[i][j-1];
            }
        }
    }
    static int sum2(int[][]a,int l1,int r1,int l2,int r2){
        int sum=0;
        findPrefixSumMatrix(a);
        for(int i=l1;i<=l2;i++){
            //r1 to r2 sum for row i
            if(r1>=1){
                sum+=a[i][r2]-a[i][r1-1];
            }
            else {
                sum+=a[i][r2];
            }
        }
        return sum;
    }

    //Method 3
    static void findPrefixSumMatrix2(int[][]a){
        int r=a.length;
        int c=a[0].length;

        //traverse horizontally to calculate row wise prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                a[i][j]+=a[i][j-1];
            }
        }
        //traverse vertically to calculate column wise prefix sum
        for(int j=0;j<c;j++){ //fixing column
            for(int i=1;i<r;i++){
                a[i][j]+=a[i-1][j];
            }
        }
    }
    static int sum3(int[][]a,int l1,int r1,int l2,int r2){
        int ans=0,sum=0,up=0,left=0,leftUp=0;
        findPrefixSumMatrix(a);
        sum=a[l2][r2];
        if(l1>=1) {
            up=a[l1-1][r2];
        }
        if(r1>=1) {
            left=a[l2][r1-1];
        }
        if(l1>=1 && r1>=1 ) {
            leftUp=a[l1-1][r1-1];
        }

        ans=sum-up-left+leftUp;

        return ans;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //Input elements in 2D array.
        System.out.println("Enter number of rows and columns of matrix  ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        System.out.println("Enter matrix value");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }


        //Q1
        //Given a matrix 'a' of dimension n*m and 2 coordinates (l1,r1) and (l2,r2). Return the sum of the rectangle from (l1,r1) to (l2,r2).
        /*
        l2 >= l1,r2 >= r1
        0 <= l1,l2 < n
        0 <= r1,r2 < m
         */
        //Method 1: Brute force approach
        System.out.println("Input coordinates of the matrix to calculate sum ");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2= sc.nextInt();
        System.out.println("Sum of the rectangle is: "+sum(a,l1,r1,l2,r2));

        //Method 2: Pre-Calculating the horizontal sum for each row in the matrix
        System.out.println("Sum2: "+sum2(a,l1,r1,l2,r2));


        //Method 3: Prefix sum over columns and rows both*
        System.out.println("Sum3: "+sum3(a,l1,r1,l2,r2));




    }
}
