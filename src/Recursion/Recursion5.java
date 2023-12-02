package Recursion;

public class Recursion5 {

    //Given an array print it's all element.
    public static void printArray(int[] arr,int idx){
        if(idx==arr.length) return;
        System.out.println(arr[idx]);
        printArray(arr,idx+1);

    }

    //Print the max value of an array.
    public static int printMax(int []arr,int idx){
        if(idx==arr.length-1) return arr[idx];
        int smallAns = printMax(arr,idx+1);
        return Math.max(smallAns,arr[idx]);
    }

    //Sum of the elements of the array.
    public static int elementSum(int []arr,int idx){
        if(idx==arr.length) return 0;
        elementSum(arr,idx+1);
        return elementSum(arr,idx+1)+arr[idx];
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        printArray(a,0);

        System.out.println(printMax(a,0));

        System.out.println(elementSum(a,0));
    }
}
