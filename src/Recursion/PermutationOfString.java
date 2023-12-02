package Recursion;

public class PermutationOfString {
    static void swap(String s,int l,int r){
        String temp= String.valueOf(s.charAt(l));
        s.charAt(l)=s.charAt(r);
        s.charAt(r)=temp;
    }
    static void permu(String s,int l,int r){
        if (l==r) {
            System.out.println(s);
            return;
        }
        for (int i=l;i<=r;i++) {
            s = swap(s, l, r);
            permu(s, l, r);
            s = swap(s, l, r);
        }
    }
    public static void main(String[] args) {
        String s="abc";
    }
}
