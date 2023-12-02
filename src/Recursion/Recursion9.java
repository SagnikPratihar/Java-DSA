package Recursion;

import java.util.Locale;

public class Recursion9 {
    //Frog jump problem
    static int frogJump(int []h,int n,int idx){
        if (idx==n-1){
            return 0;
        }

        int op1 = Math.abs(h[idx]-h[idx+1])+frogJump(h,n,idx+1);
        if (idx==n-2) return op1;
        int op2 = Math.abs(h[idx]-h[idx+2])+frogJump(h,n,idx+2);
        return Math.min(op1,op2);
    }

    //Keypad Combination finding.
    static void combination(String dig, String[] kp,String res){
        if (dig.length()==0){
            System.out.println(res+" ");
            return;
        }
        int currNum=dig.charAt(0)-'0';
        String currChoices =kp[currNum];
        for(int i=0;i<currChoices.length();i++){
            combination(dig.substring(1),kp,res+currChoices.charAt(i));
        }

    }
    public static void main(String[] args) {
        //1
        int []h = {10,30,40,20};
        System.out.println(frogJump(h,h.length,0));

        //2
        String s="23";
        String []kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //            0  1   2     3     4    5     6      7     8      9
       combination(s,kp,"");
    }
}
