package Recursion;

public class Recursion2 {
    //Find sum of digits
    public static int sumOfDigits(int n){
        if(n>=0 && n<=9) return n;
        return sumOfDigits(n/10)+n%10;

    }

    //Find p^q using recursion
    public static int pow(int p,int q){
        if(q==0) return 1;
        return pow(p,q-1)*p;
    }
    public static int pow2(int p,int q){
        if(q==0) return 1;
        int smallAns = pow2(p,q/2);
        if(q%2==0){
            return smallAns*smallAns;
        }
        else{
            return smallAns*smallAns*p;
        }
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
        System.out.println(pow(2,4));
        System.out.println(pow2(2,4));
    }
}
