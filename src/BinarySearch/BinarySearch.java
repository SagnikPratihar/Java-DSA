package BinarySearch;

public class BinarySearch {
    static boolean binarySearch(int[] a, int target){
        int n=a.length;
        int st=0, end=n-1;  //0 based indexing
        while(st<=end){
            int mid=(st+end)/2;
            if(a[mid]==target) return true;
            else if(target<a[mid]) end=mid-1;
            else if(target>a[mid]) st=mid+1;
        }
        return false;
    }

    static boolean recBinarySearch(int[] a,int target,int st,int end){
        if(st>end) return false;
        int mid=st+(end-st)/2;
        if (a[mid]==target) return true;
        else if(a[mid]>target) return recBinarySearch(a,target,st,end-1);
        else return recBinarySearch(a,target,mid+1,end);
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int target=3;
        System.out.println(binarySearch(a,target));

        System.out.println(recBinarySearch(a,target,0,a.length-1));
    }
}
