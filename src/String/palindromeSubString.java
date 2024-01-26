package String;

import java.util.Scanner;

public class palindromeSubString {
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String str=sc.next();
         /*
         // Reverse a string -->
         StringBuilder gtr=new StringBuilder(str);
         gtr.reverse();
         String s=gtr+"";
         if(str.equals(s)) System.out.println("Palindrome");
         else System.out.println("Not palindrome");
          */
        /*
        // Reverse a string -->
        int i=0;
        int j=str.length()-1;
        boolean flag = true;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                flag=false;
                break;
            }
                i++;
                j--;
        }
        if(flag) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
         */
        int count =0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindrome(str.substring(i,j))){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("The number of palindromic substrings are : "+count);
    }
}
