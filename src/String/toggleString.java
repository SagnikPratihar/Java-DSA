package String;

import java.util.Scanner;

public class toggleString {
    public static void main(String[] args) {
        /*

         */
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.nextLine());
        System.out.println(s);
        for (int i=0;i<s.length();i++){
            //check - alphabet -> small, capital
            boolean flag=true; //true - capital
            char ch=s.charAt(i);
            if (ch==' ') continue;
            int asci=(int)ch;
            if (asci>=97) flag=false; //false - small
            if (flag){
                asci+=32;
                char ans=(char) asci;
                s.setCharAt(i,ans);
            }
            else{
                asci-=32;
                char ans=(char) asci;
                s.setCharAt(i,ans);
            }
        }
        System.out.println(s);
    }
}
