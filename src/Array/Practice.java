package Array;

public class Practice {
    void maxOfArray(){
        int []arr={5,6,3,8,7,2};
        int ans =0;
        for(int  i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        //Q1
        Practice obj=new Practice();
        obj.maxOfArray();
    }
}
