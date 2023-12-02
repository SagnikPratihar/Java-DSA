package SortAlgorithm;

public class BubbleSort {
    static void bubbleSort(int []arr){
        //n-1 iterations / passes
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){  //last i element are already at correct sorted position, so no need to check them.
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //Optimised solution
    static void bubbleSort2(int []arr){
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int []a={7,6,5,4,3};
        bubbleSort2(a);
        for (int i:a){
            System.out.print(i+" ");
        }
    }
}
