package BinarySearch;

public class RotatedSortedArray {

    /*Q1 - A rotated sorted array on which rotation operation has been performed some number of times. Given a rotated
           sorted array, find the index of the minimum element in the array.
     */
    static int minElement(int[] a){
        int n=a.length;
        int st=0,end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if (a[mid]<=a[n-1]){
                ans=mid;
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return ans;
    }


    /*Q2 - Given the rotated sorted array of integers which contains distinct integers and an integer target,
           return the index of the target if it is present in the array, otherwise return -1.(You can not use linear
           search and allowed to use only one binary search)  <IMPORTANT>!!
     */
    static int index(int[] a,int target){
        int n=a.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target==a[mid]) return mid;
            else{
                if(a[mid]<a[end]){  //mid to end is sorted
                    if(target>a[mid] && target<=a[end]) st=mid+1;
                    else end=mid-1;
                }
                else{
                    if(target>=st && target<a[mid]) end=mid-1;
                    else st=mid+1;
                }
            }
        }
        return -1;
    }


    //Q3 - Search element in rotated sorted array with duplicate element. Return true if it is found else return false.!!
    static int dupli(int[] a,int target){
        int st = 0, end = a.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(a[mid] == target){
                return mid;
            }
            else if(a[st] == a[mid] && a[end] == mid){
                st++;
                end--;
            }
            else if (a[mid] <= a[end]){ // mid to end is sorted
                if(target > a[mid] && target <= a[end]){
                    st = mid+1;
                } else {
                    end = mid-1;
                }
            } else { // st to mid is sorted
                if(target >= a[st] && target < a[mid]){
                    end = mid-1;
                } else {
                    st = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //Q1
            int[] a={3,4,5,1,2};
        System.out.println(minElement(a));

        //Q2
        int target =4;
        System.out.println(index(a,target));

        //Q3
        int[] b={0,1,1,1,2,3,1,1,1};
        int target2=2;
        System.out.println(dupli(b,target2));
    }
}
