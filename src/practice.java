import java.util.Scanner;

class practice {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your weight : ");
        int w=sc.nextInt();
        System.out.println("Enter your height in meter : ");
        float h= sc.nextFloat();
        float b=  (w/(h*h));
        if(b<18.5) System.out.println("UnderWeight");
        else if(b>=18.5 && b<=24.9) System.out.println("NormalWeight");
        else if(b>=25 && b<=29.9) System.out.println("OverWeight");
        else System.out.println("Obese");

       
    }
}

         

