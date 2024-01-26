package BinarySearch;

public class PracticeQuestion {

    //Q1 - Find the first occurrence of a given element x, given that the given array is sorted. If no occurrence of x is given then return -1.
    static int firstOccurrence(int[] a, int target){
        int n=a.length;
        int st=0,end=n-1;
        int fo=-1;
        while(st<=end) {
            int mid = st + (end - st) / 2;
            if(a[mid]==target) {
                 fo=mid;
                end=mid-1;
            }
            else if (target<a[mid]) end = mid-1;
            else if (target>a[mid]) st=mid+1;
        }
        return fo;
    }



    //Q2 - Find the square root of a non-negative number x. Round it to the nearest floor integer value.
    static int sqrt(int x){
        int st = 0, end = x;
        int ans = -1;
        while (st <=end){
            int mid = st + (end-st)/2;
            int val = mid * mid; // use long here to avoid overflow
            if(val == x){
                return mid;
            } else if(val < x){
                ans = mid;
                st = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        //Q1
        int[] a={5,5,5,5,6,6,8,9,9,9};
        int target=5;
        System.out.println(firstOccurrence(a,target));

        //Q2
        int x=9;
        System.out.println(sqrt(x));
    }
}
