import java.util.Scanner;

public class Q1_1068
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        System.out.print(n+" ");
        while(n>1) {
            if (n % 2 != 0) {
                n = (n*3)+1;
                System.out.print(n+" ");
            }
            else  {
                n = n/2;
                System.out.print(n+" ");
            }

        }
    }
}
