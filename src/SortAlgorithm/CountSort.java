package SortAlgorithm;

public class CountSort {
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
    static void basicCountSort(int[] arr){
        int max=findMax(arr);
        int[] count=new int[max+1];
        //Making frequency array
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for (int i=0;i<count.length;i++){
            for (int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }

    //Stable Algorithm
    static void countSort(int[] arr){

        int n=arr.length;
        int []output=new int[n];
        int max=findMax(arr);
        int[] count=new int[max+1];

        //Making frequency array
        for (int i=0;i<arr.length;i++){   //TC -> n
            count[arr[i]]++;
        }

        //Make prefix sum array of count array
        for(int i=1;i<count.length;i++){  //Tc -> max
            count[i]+=count[i-1];
        }

        //Find the index of each element in the original array and put it in output array
        for (int i=n-1;i>=0;i--){   //TC -> n
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }

        //Copy all elements of output to arr
        for (int i=0;i<n;i++){   //TC -> n
            arr[i]=output[i];
        }

    }
    public static void main(String[] args) {
        int []arr={1,4,5,2,2,5};
//        basicCountSort(arr);
        countSort(arr);
        displayArray(arr);

    }
}
