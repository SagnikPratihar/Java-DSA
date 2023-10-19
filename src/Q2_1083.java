
import java.util.Scanner;

public class Q2_1083 {
    public static int findMissing(int []arr,int n){
       int sum;
       sum=((n+1)*(n+2))/2;
       for(int i=0;i<n;i++){
           sum-=arr[i];
       }
       return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a= new int[n];
        int N=a.length;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(findMissing(a,N));

    }
}
