package SortAlgorithm;

public class SelectionSort {
    static void selectionSort(int[] a){
        int n=a.length;
        for (int i=0;i<n-1;i++){  // i represent the current index

            //Find the minimum element in unsorted part of array
            int minidx=i;
            for (int j=i+1;j<n;j++){
                if (a[j]<a[minidx]){
                  minidx=j;
                }
            }
            //swap current element and  minimum element -> current index will have correct element
            if (minidx!=i){
                int temp=a[i];
                a[i]=a[minidx];
                a[minidx]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int []a={5,3,2,1,4};
        selectionSort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
