package Recursion;

import java.util.Scanner;

public class Recursion0 {

    //Program to write natural numbers from 1 to n using recursion
    static void printIncreasing(int n){
        if(n==1){                //Halting Condition or base case
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);    //smaller or sub problem
        System.out.println(n);      //self-work
    }


    //Program to write natural numbers from n to 1 using recursion
    static void printDecreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(n);
        printDecreasing(n);
    }
}
