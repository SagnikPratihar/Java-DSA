package String;

import java.util.StringTokenizer;

public class stringToken {
    public static void main(String[] args) {
        StringTokenizer s=new StringTokenizer("Hello : good : morning");
        while(s.hasMoreTokens()) {
            System.out.println(s.nextToken());
        }
        StringTokenizer s2=new StringTokenizer("Java : has : more : functionalities",":");
        while(s2.hasMoreTokens()){
            System.out.println(s2.nextToken());
        }
        StringTokenizer s3=new StringTokenizer("The : cow : is : flying : in : the : sky",":",true);
        while(s3.hasMoreTokens()){
            System.out.println(s3.nextToken());
        }
    }
}
