package Recursion;

import Array.ArrayList;

public class Recursion8 {

    //Return all subsequences using array list.
    /*
    static ArrayList<String> getSSQ(String s){
        // s = "abc"
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }
        char curr = s.charAt(0);  //a
        ArrayList<String> smallAns = getSSQ(s.substring(1));  //bc
        for(String ss : smallAns){
            ans.add(ss);  //bc
            ans.add(curr+ss);  //abc
        }
        return ans;
    }

     */

    //Return all subsequences without using array list.
    static void printSSQ(String s,String currAns){ //s = "abc" , currAns = " "
        if (s.length()==0) {
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0); //a
        String remString = s.substring(1);  //bc
        //curr char -> chooses to be a part of currAns
        printSSQ(remString,currAns+curr);  //bc , a
        //curr char -> does not choose to be a part of currAns
        printSSQ(remString,currAns);  // bc  , " "
    }
    public static void main(String[] args) {
        /*
    ArrayList<String> ans = getSSQ("abc");
    for (String ss : ans){
        System.out.println(ss);
    }

         */

        printSSQ("abc"," ");

    }
}
