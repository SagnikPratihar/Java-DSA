package Recursion;

public class PermutationOfString {
    static String swap(String str,int i,int j){
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        String s = new String(ch);
        return s;
    }
    static void permu(String s,int l,int r){
        if (l==r) {
            System.out.println(s);
            return;
        }
        for (int i=l;i<=r;i++) {
           s= swap(s, l, r);
            permu(s, l, r);
            s= swap(s, l, r);
        }
    }
    public static void main(String[] args) {
        String s="abc";
        permu(s,0,s.length()-1);
    }
}
