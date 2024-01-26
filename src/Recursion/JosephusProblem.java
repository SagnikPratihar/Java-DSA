package Recursion;

public class JosephusProblem {
    //Find the number of ways in nxm matrix.
    static int number(int n,int m){
        if(n==1 || m==1) return 1;
        return number(n-1,m)+number(n,m-1);
    }

    //Josephus problem
    static int jos(int n,int k){
        if(n==1) return 0;
        return (jos(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        System.out.println(number(3,3));
        System.out.println(jos(3,2));
    }
}
