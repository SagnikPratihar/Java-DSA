package Recursion;

import java.util.Scanner;

public class Recursion1 {
    //Factorial
    public static int fac(int n){
        if(n==0){
            return 1;
        }
        return n*fac(n-1);
    }
    //Fibonacci 
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //Finding factorial of n numbers using recursion.
        System.out.println(fac(5));


        //Fibonacci Number
        System.out.println(fib(6));


    }
}
