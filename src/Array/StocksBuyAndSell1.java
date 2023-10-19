package Array;

public class StocksBuyAndSell1 {
    static int maxProfit(int[] a){
        int maxProfit = 0;
        int minSoFar=a[0];
        for(int i=0;i<a.length;i++){
            minSoFar=Math.min(minSoFar,a[i]);
            int profit=a[i]-minSoFar;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int []a={3,1,4,8,7,2,5};
        System.out.println(maxProfit(a));

    }
}
