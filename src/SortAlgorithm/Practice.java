package SortAlgorithm;

import java.util.SplittableRandom;

public class Practice {

    //Sorting string using bubble sort.
    static void sortString(String[] arr){
        String temp;
        int n= arr.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j].compareTo(arr[i]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] s={"d","e","a","c","b"};
        sortString(s);
        for (String i:s){
            System.out.print(i+" ");
        }

    }
}
