package Recursion;

public class Recursion7 {

    //Remove all occurrence of 'a' from string s = acbcax.
    public static String removeOccurrence(String s,int idx){
        if(idx == s.length()) return " ";
        String smallAns = removeOccurrence(s,idx+1);
        if(s.charAt(idx) != 'a'){
            return s.charAt(idx)+smallAns;
        }
        else{
            return smallAns;
        }

    }


    //Reverse a string using recursion.
    public static String reverse(String s,int idx){
        if(idx==s.length()) return " ";
        String smallAns = reverse(s,idx+1);
        return smallAns + s.charAt(idx);
    }
    //Reverse the string without using idx.
    public static String reverse2(String s){
        if(s.length() == 0) return " ";
        String smallAns = reverse2(s.substring(1));
        return smallAns + s.charAt(0);

    }


    public static void main(String[] args) {
        String s = "DAD";
        System.out.println(removeOccurrence(s,0));
        System.out.println(reverse(s,0));

        //Check the string is palindrome or not.
        String rev = reverse(s,0);
        if(rev.equals(s)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        //Check palindrome without reverse the string.

    }
}
