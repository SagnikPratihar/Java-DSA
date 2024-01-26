package BinarySearch;

public class AnsValuePattern {
    /* Q1 - You have 'n' (n<=10^5)boxes of chocolate. Each box contains a[i](a[i]<=10000) chocolates. You need to distribute
            these boxes among 'm' students such that the maximum number of chocolates allocated to a student in minimum.
            a) One box will be allocated to exactly one student.
            b) all the boxes should be allocated.
            c) Each student has to be allocated at least one box.
            d) Allotment should be in contiguous order, for instance, a student cannot be allocated box1 and box3 skipping box 2.

            Calculate and return that minimum possible number.
            Assume that it is always possible to distribute the chocolates.
     */
    static boolean isDivisionPossible(int[] a,int m,int maxChocolatesAllowed){
        int numOfStudents=1;
        int choco=0;  //number of chocolate current student has
        for(int i=0;i<a.length;i++){
            if(a[i]>maxChocolatesAllowed) return false;
            if((choco+a[i])<=maxChocolatesAllowed){
                choco+=a[i];
            }
            else{
                numOfStudents++;
                choco=a[i];
            }
        }
//        if(numOfStudents>m) return false;
//        else return true;
        return numOfStudents<=m;
    }
    static int distributeChocolates(int[] a,int m){
        if(a.length<m) return -1;
        int ans=0, st = 1, end = (int)1e9;
         while(st<=end){
             int mid=st+(end-st)/2;
             if(isDivisionPossible(a,m,mid)){
                 ans=mid;
                 end=mid-1;
             }
             else{
                st=mid+1;
             }
         }
         return ans;
    }


    /* Q2 - A new racing track for kids is being built in New York with 'n' starting spots.The spots are located along a
           straight line at position x1, x2,...xn(xi<=10^9). For each 'i',xi+1>xi.
           At a time only 'm' children are allowed to enter the race. Since the racetrack is for kids,they may run into
           each other while running. To prevent this, we want to choose the starting spots such that the minimum distance
           between any two of them is as large as possible. What is the largest minimum distance?

           The first line of input will contain the value of n, yhe number of starting spots.
           The second line of input will contain the n numbers denoting the location of each spot.
           The third line will contain the value of m, number of children.
     */
    static boolean isPossible(int[] a,int k,int dist){
        int kidPlaced=1;
        int lastKid=a[0];
        for(int i=0;i<a.length;i++){
            if((a[i]-lastKid)>=dist){
                kidPlaced++;
                lastKid=a[i];
            }
        }
        return kidPlaced>=k;
    }
    static int raceTrack(int[] a,int k){
        if(k>a.length) return -1;
        int st=0,end=a.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isPossible(a,k,mid)){
                ans=mid;
                st=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int []a={5,3,1,2,4};
        int m=3;
        System.out.println(distributeChocolates(a,m));

        int[] b={1,2,4,8,9};
        int k=2;
        System.out.println(raceTrack(b,k));
    }
}
