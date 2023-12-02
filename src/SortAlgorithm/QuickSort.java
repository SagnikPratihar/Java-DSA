package SortAlgorithm;

public class QuickSort {
    static void displayArray(int []arr){
        for (int v:arr){
            System.out.print(v+" ");
        }
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int[] arr,int st,int end){
        int pivot=arr[st];
        int count=0;
        for (int i=st+1;i<end;i++){
            if (arr[i]<=pivot) count++;
        }
        int pivotIndex=st+count;
        swap(arr,st,pivotIndex);
        int i=st,j=end;
        while(i<pivotIndex && j>pivotIndex){
            while (arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if (i<pivotIndex && j>pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    static void quickSort(int []arr,int st,int end){
        if (st>=end) return;
        int pi=partition(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
    }
    public static void main(String[] args) {

        int[] arr={2,5,2,4,8,7,9};
        System.out.println("Array before sorting");
        displayArray(arr);
        System.out.println();
        quickSort(arr,0,arr.length-1);
        System.out.println("Array after sorting");
        displayArray(arr);
    }
}
