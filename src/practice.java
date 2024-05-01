import java.util.*;

class practice {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
       int[] a=new int[9];
       int count=0;
       for(int i=0;i<9;i++){
          a[i]=sc.nextInt();
       }
       for(int i=0;i<9;i++){
           if(a[i]==9) count++;
       }
        System.out.println(count);




    }

}


         

