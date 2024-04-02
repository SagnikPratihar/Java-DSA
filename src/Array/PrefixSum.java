package Array;

public class PrefixSum {

    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Q1
    //With creating a new array
    static int[] makePrefixSum(int []arr){
        int n=arr.length;
        int []pref=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
    //Without creating a new array
    static int[] makePrefixSum2(int[] arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }

    //Q3
    static int findArraySum(int[] arr){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[1];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum=findArraySum(arr);
        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            int suffixSum=totalSum-prefSum;
            if(prefSum==suffixSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        //Q1
        //Given an integer array 'a', return the prefix sum/running sum in the same array without creating a new array.
        //With creating a new array
        int[] a={2,1,3,4,5};
        int[] ans=makePrefixSum(a);
        printArray(ans);
        //Without creating a new array
        int[] pref=makePrefixSum2(a);
        printArray(pref);


        //Q2*
        //Given an array of integers of size n. Answer q queries where you need to print the sum of values in
        // a given range of indices from l to r (both including).
        //Note: The values of l and r in queries follow 1-based indexing.
        int[] b={1,2,3,4,5,6};
        int q=2;
        int[] prefSum=makePrefixSum(b);
        while(q-->0){

            int l=1;
            int r=5;

            int ans2 =prefSum[r]-prefSum[l-1];
            System.out.println("Sum : "+ans2);
        }


        //Q3
        //Check if we can partition the array into two sub-arrays with equal sum. More formally, check that
        // the prefix sum of a part of the array is equal to the suffix sum of the rest of the array.
        int []c={5,3,2,6,3,1};
        int[] c1={1,1,1,1,1,1};
        System.out.println("Equal partition possible : "+equalSumPartition(c1));


        //Q4
        //Find suffix sum of a given array.

    }
}
