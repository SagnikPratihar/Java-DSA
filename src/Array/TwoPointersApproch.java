package Array;

public class TwoPointersApproch {

    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Q1
    //methode 1
    static void sortZerosAndOnes(int[]arr){
        int n=arr.length;
        int zeroes=0;
        //Count number of zeroes
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        //0 to zeroes-1 : 0, zeroes to n-1 : 1
        for(int i=0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }
    }
    //methode 2
    static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortZeroesAndOnes2(int[] arr) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }

    }

    //Q2
    static void evenOddSort(int []arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
    }

    //Q3

    static int[] square(int []arr){
        int n=arr.length;
       int left=0;
       int right=n-1;
       int []ans = new int[n];
       int k=0;
       while(left<=right){
           if(Math.abs(arr[left])>Math.abs(arr[right])){
               ans[k++]=arr[left]*arr[left];
               left++;
           }
           else{
               ans[k++]=arr[right]*arr[right];
               right--;
           }
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
    public static void main(String[] args) {

        //Q1
        //Sort an array consisting of only 0s and 1s.
        int[] a={1,0,0,1,0,1,1,0,0};
        int[] a1={1,0,0,1,1,0,1};
        //sortZerosAndOnes(a);
        System.out.println("Sorted array : ");
        //printArray(a);
        sortZeroesAndOnes2(a1);
        printArray(a1);


        //Q2
        //Given an array of integers 'b', move all the even integers at the beginning of the array followed by all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition.
        int[] b={1,2,3,4,5,6,7,8,9};
        evenOddSort(b);
        System.out.println("Condition satisfied array is : ");
        printArray(b);


        //Q3
        //Given an integer array 'c' sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
        int []c = {-10,-3,-2,1,4,5};
        int[] ans =square(c);
        reverseArray2(ans);
        printArray(ans);




    }
}
