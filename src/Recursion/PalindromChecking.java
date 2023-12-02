package Recursion;

public class PalindromChecking {
    static boolean pali(String s,int l ,int r){
        if (l>=r) return true;
        if (s.charAt(l)!=s.charAt(r)) return false;
        return pali(s,l+1,r-1);
    }
    public static void main(String[] args) {
        String s="abca";
        System.out.println(pali(s,0,s.length()-1));
    }
}
