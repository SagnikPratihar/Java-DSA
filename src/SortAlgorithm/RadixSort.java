package SortAlgorithm;

public class RadixSort {
    static void displayArray(int []arr){
        for (int v:arr){
            System.out.print(v+" ");
        }
    }
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }

    static void countSort(int[] arr, int place) {

        int n = arr.length;
        int[] output = new int[n];

        int[] count = new int[10];
        for (int i = 0; i < n; i++) { //Store the count of each element
            count[(arr[i]/place)%10]++;
        }

        //Make prefix sum array of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        //Find the index of each element in the original array and place the elements in output array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        //Copy all elements of output to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int[] arr){
        //Get maximum element
        int max = findMax(arr);
        //Apply counting sort to sort elements based on place value.
        for (int place=1;max/place>0;place+=10){
            countSort(arr,place);
        }
    }
    public static void main(String[] args) {

        int[] arr={170,45,75,90,802,2};
        radixSort(arr);
        displayArray(arr);
    }
}
