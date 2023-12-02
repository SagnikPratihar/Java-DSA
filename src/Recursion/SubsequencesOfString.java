package Recursion;

public class SubsequencesOfString {
    static void printSeq(String s,int i,String cur){
        if (i==s.length()) {
            System.out.println(cur);
            return;
        }
        printSeq(s,i+1,s.charAt(i)+cur);
        printSeq(s,i+1,cur);
    }
    public static void main(String[] args) {
        String s="abc";
        printSeq(s,0,"");
    }
}
