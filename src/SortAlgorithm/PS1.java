package SortAlgorithm;

public class PS1 {
    //Move all 0's to the end of an array maintaining the relative order of other non-zero elements
    public static void sort(int []arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //Given an array of names of fruits, you are supposed to sort it in lexicographical order using the selection sort.
    public static void lexiSort(String[] s){
        int n=s.length;
        for (int i=0;i<n-1;i++){
            int minidx=i;
            for (int j=i+1;j<n;j++){
                if (s[j].compareTo(s[minidx])<0){
                    minidx=j;
                }
            }
            String temp=s[i];
            s[i]=s[minidx];
            s[minidx]=temp;
        }
    }

    public static void main(String[] args) {
        int[] a={0,1,0,2,3,4};
        sort(a);
        for (int d:a){
            System.out.print(d+" ");
        }

        String []s={"papaya","lime","watermelon","apple","mango","kiwi"};
        lexiSort(s);
        for(String t:s){
            System.out.print(t+" ");
        }
    }
}
