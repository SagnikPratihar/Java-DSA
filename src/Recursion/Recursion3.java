package Recursion;

public class Recursion3 {
    //Given a number num and a value k. Print k multiples of num.
    public static void mul(int num,int k){
        if(k==1){
            System.out.println(num);
            return;
        }
        mul(num,k-1);
        System.out.println(num*k);
    }

    //Series sum
    public static int sum(int n){
        if(n==0) return 0;
        return sum(n-1)+n;
    }

    //Given a number n. Find the sum of natural numbers till n but with alternate sign.
    public static int sum2(int n){
        if(n==0) return 0;
        if(n%2==0){
            return sum2(n-1)-n;
        }
        return sum2(n-1)+n;
    }
    public static void main(String[] args) {
        mul(3,4);
        System.out.println(sum(5));
        System.out.println(sum2(5));
    }
}
