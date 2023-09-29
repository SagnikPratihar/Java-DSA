package Array;

public class Arrays4 {
    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //Q1
    static void swap(int a,int b){
        System.out.println("Original values before swap : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Values after swap : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    //Q2
    static void swap2(int a,int b){
        System.out.println("Original values before swap : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values after swap : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    //Q3
    static int[] reverseArray(int []arr){
        int n=arr.length;
        int[] ans = new int[n];
        int j=0;
        //Traverse original array in reverse direction.
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        return ans;
    }
    static void swapInArray(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseArray2(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }



    //Q4
    static int[] rotateArray(int []arr,int k){
        int n = arr.length;
        k=k%n;
        int []ans = new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {

        //Q1
        //Given 2 integers a and b. Swap the 2 given values using temporary variables.
        int a = 9;
        int b = 3;
        int []arr = {1,2,3,4,5};
        swap(a,b);


        //Q2
        //Given 2 integers a and b. Swap the 2 given values using sum and difference methode.
        int c=9;
        int d=3;
        swap2(c,d);


        //Q3
        //Reverse an array consisting of integer values.
        int []e={1,2,3,4,5};
       // int[] ans=reverseArray(e);
        reverseArray2(e);
        for (int an : e) {
            System.out.print(an + " ");
        }
        System.out.println();


        //Q4
        //Rotate the given array ‘f’ by k steps, where k is non-negative.
        //Note: k can be greater than n as well.
        int []f = {1,2,3,4,5};
        int k = 4;
        int[] ans=rotateArray(f,k);
        printArray(ans);


        //Q5
        //Rotate the given array ‘g’ by k steps, where k is non-negative without using extra space.
        //Note: k can be greater than n as well.
        int []g = {1,2,3,4,5};
        int l = 4;
        


    }
}
