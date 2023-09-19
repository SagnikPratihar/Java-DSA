package Array;

import java.util.Arrays;

public class ArrayReference {
    static void returnArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr = new int[5];
        arr[0]=1;
        arr[1]=4;
        arr[2]=3;
        arr[3]=9;
        arr[4]=5;

        //Original Array
        System.out.print(" Original Array : ");
        returnArray(arr);

        //Various methods to copy an array

        //int []arr_2 = arr;   //Shallow Copy
        //int []arr_2 = arr.clone();   //Deep Copy
        //int []arr_2 = Arrays.copyOf(arr,arr.length);
        int []arr_2 = Arrays.copyOfRange(arr,1,4);

        //Copied Array
        System.out.print("Copied Array : ");
        returnArray(arr_2);
/*
        //Changing the values if arr_2
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.print(" Original Array : ");
        returnArray(arr);
        System.out.print("Copied Array : ");
        returnArray(arr_2);

 */

    }
}
