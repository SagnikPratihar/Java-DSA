package Array;

public class TargetSumProblem {
//Q1
    static void pairSum(int [] arr, int x){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])==x){
                    count++;
                }
            }

        }
        System.out.println(count);
    }

    //Q2
    static void tripleSum(int[] arr,int y){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=i+2;k<n;k++){
                    if((arr[i]+arr[j]+arr[k])==y){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    //Q3
    static void findUnique(int arr){

    }
    public static void main(String[] args) {
        //Q1
        //Find the total number of pairs in the array whose sum is equal to the given value x.
        int []a={4,6,3,5,8,2};
        int x=7;
        pairSum(a,x);



        //Q2
        //Count the number of triplets whose sum is equal to the given value x.
        int []b={1,4,5,6,7};
        int y=12;
        tripleSum(b,y);


        //Q3
        //Find the unique number in a given array where all the elements are repeated twice with one value being unique.
        int []c={21,7,3,21,5,7,5};


    }
}
