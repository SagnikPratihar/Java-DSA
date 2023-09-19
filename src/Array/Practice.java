package Array;

import java.util.Arrays;

public class Practice {
    //Q1
    void maxOfArray(){
        int []arr = {5,6,3,8,7,2};
        int ans = 0;
        for(int  i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }

    //Q2
    static void countOccurrence(int[] arr, int x){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(count);
    }

    //Q3
    static int lastOccurrence(int []arr,int x){
        int lastIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }

    //Q4
    static int strictlyGreater(int[] arr, int x){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }

    //Q5
    static boolean sorted(int []arr){
        boolean check  = true;
        for(int i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }

    //Q6
    static int[] smallestAndLargest(int []arr){
        Arrays.sort(arr);
        int []ans = {arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        Practice obj = new Practice();
        //Q1
        //Find the maximum number in an array.
        obj.maxOfArray();


        //Q2
        //Count the number of occurrences of particular element x.
        int []arr = {5,6,5,1,5};
        int x = 5;
        countOccurrence(arr,x);


        //Q3
        //Find the last occurrence of an element x in a given array.
        int []arr2 = {5,6,5,1,6,7};
        int x2 = 6;
        System.out.println(lastOccurrence(arr2,x2));


        //Q4
        //Count the number of elements strictly greater than value of x.
        int []arr3 = {5,3,9,1,6,2};
        int x3 = 5;
        System.out.println(strictlyGreater(arr3,x3));


        //Q5
        //Check if the given array is sorted or not.
        //int []arr4 = {5,3,9,1,6,2,4,8,12,10,11};
        int []arr4 = {1,2,3,4,5,5};
        System.out.println(sorted(arr4));


        //Q6
        //Return an array who's first element is the largest value and second element is the smallest element of the given array.
        int []arr5 = {3,4,2,8,7,6};
        int[] ans = smallestAndLargest(arr5);
        System.out.println(ans[0] + " "+ans[1]);


        //Q7
        //Find the k'th smallest and the largest element of an array.
    }
}
