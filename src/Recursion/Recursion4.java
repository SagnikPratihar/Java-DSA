package Recursion;

public class Recursion4 {
    //Find GCD
    public static int iGCD(int x,int y){
        while(x % y != 0){
            int rem =x%y;
            x=y;
            y=rem;
        }
        return y;
    }

    //Using Euclid's Algorithm
    public static int gcd(int x,int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }

    public static void main(String[] args) {
        System.out.println(iGCD(15,24));
        System.out.println(gcd(15,24));
    }
}
