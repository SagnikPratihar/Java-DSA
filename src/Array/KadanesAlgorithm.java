package Array;

public class KadanesAlgorithm {
    static int maxSubArray(int []a){
        int maxSum=0;
        int curSum=0;
        for(int i=0;i<a.length;i++){
            curSum+=a[i];
        }
        if(curSum>maxSum){
            maxSum=curSum;
        }
        if(curSum<0){
            curSum=0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
       //Maximum sum sub array
        //Process 1
        //Process 2
        int []a={-5,4,6,-3,4,1};
        System.out.println(maxSubArray(a));

    }
}
