import java.util.Arrays;
import java.util.Scanner;

class practice {
//public static boolean check(int num){
//    return (num & 1)==1;
//}
     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(check(8));
         int []nums= {2,8,5,4};
         int n=nums.length;
         int count=0;
         int []a=new int[n];
         for(int i=0;i<n;i++){
             a[i]=nums[i];
         }
         Arrays.sort(nums);
         for(int i=0;i<n;i++){
             if(a[i]==nums[i]) return;
             else count++;
         }
         System.out.println(count);
             }
         }

         

