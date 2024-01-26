package BinarySearch;

public class BSProblem_2 {

    /* Q1A - Search the target value in a 2D integer matrix of dimensions nxm and return true if found, else return
            false. This matrix has the following properties:
            1. Integers in each row are sorted from left to right.
            2. The first integer of each row is greater than the last integer of the previous row.
     */
    static boolean matrix(int[][] a,int target){
        //n- row number and m - column number
        int n=a.length,m=a[0].length;
        int st=0,end=n*m-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int midElt=a[mid/m][mid%m];
            if(midElt==target) return true;
            else if (target>midElt) st=mid+1;
            else end=mid-1;
        }
        return false;
    }

    /* Q1B - Search the target value in a 2D integer matrix of dimensions nxm and return true if found, else return
            false. This matrix has the following properties:
            1. Integers in each row are sorted from left to right.
            2. Integer in each column are sorted in ascending order from top to bottom.
     */
    static boolean matrix2(int[][] a,int target){
        int n=a.length,m=a[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0){
            if(a[i][j]==target) return true;
            if(target<a[i][j]){
                j--; //move left
            }
            else{
                i++; //move down
            }
        }

        return false;
    }

    /* Q2 - Given a mountain array of length greater than 3, return the index of i such that arr[0]<arr[i]<...<att[i-1]
           <arr[i]>arr[i+1]>...>arr[arr.length-1]. This index is known as the peak index.
     */
    static int peakIndex(int[] a){
        int n=a.length;
        int st=0,end=n-1;
        int peak=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]<a[mid+1]) {
                peak=a[mid+1];
                st=mid+1;
            }
            else end=mid-1;
        }
        return peak;
    }


    /* Q3 - A peak element is an element that is strictly greater than its neighbors.Given a 0-indexed integer array
           nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to
           any of the peaks. You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always
           considered to be strictly greater than a neighbor that is outside the array.
     */
    static int peak(int[] a){
        int n=a.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if((mid==0 ||a[mid]>a[mid+1]) && (mid==n-1 || a[mid]>a[mid-1])) return mid;
            else if(a[mid]<a[mid+1]) st=mid+1; //  uphill/ascending
            else if(a[mid]>a[mid+1]) end=mid-1;  //  downhill/descending
        }
        return -1;
    }
    public static void main(String[] args) {

        //Q1A
        int [][]c={{1,2,3},{4,5,6},{7,8,9}};
        int target=6;
        System.out.println(matrix(c,target));

        //Q1B
        int[][] d={{2,4,6,8},{5,6,7,20},{7,11,13,25},{12,14,17,30}};
        int target2=10;
        System.out.println(matrix2(d,target2));

        //Q2
        int []a={2,4,10,7,3,1,0};
        System.out.println(peakIndex(a));

        //Q3
        int[] b={1,2,3,1};
        System.out.println(peak(b));
    }
}
