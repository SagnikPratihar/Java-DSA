package PW;

import java.util.Scanner;

public class sp_09_PatternPrinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int r=sc.nextInt();
        int c=sc.nextInt();


        //Rectangle

//              ******
//              ******
//              ******

        /*
         for(int i=1;i<=r;i++){
             for(int j=1;j<=c;j++){
                 System.out.print("*");
             }
             System.out.println(" ");
         }

         */



         //Hollow rectangle

        /*
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

         */


        //Triangle

//        *
//        **
//        ***
//        ****

        /*
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

         */


        //Inverted triangle

//        ****
//        ***
//        **
//        *

        /*
        for(int i=1;i<=r;i++){
            for(int j=r;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

         */
        /*
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r+1-i);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

         */
        /*
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

         */

        //Pyramid
        
        /*
        for(int i=1;i<=r;i++){

            //print r-i space
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            //print 2*i-1 numbers of stars
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

         */


        //Numerical rectangular pattern
        /*
        for(int i=1;i<=r;i++){
            for(int j=i;j<=r;j++){
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println(" ");
        }

         */
        /*
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

         */


//        121212
//        212121
//        121212
//        212121
        /*
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(2);
                }
            }
            System.out.println(" ");
        }

         */


        //Numerical Triangular pattern

//        1
//        12
//        123
//        1234

        /*
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

         */

//        1
//       121
//      12321
//     1234321

        /*
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int m=i-1;m>=1;m--){
                System.out.print(m);
            }
            System.out.println(" ");
        }

         */

//        1
//       2 2
//      3   3
//     4444444

    }
}
