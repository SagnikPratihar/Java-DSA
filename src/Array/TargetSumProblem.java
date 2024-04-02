package Array;

public class TargetSumProblem {

    //Q1
    static void pairSum(int[] arr, int x) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] + arr[j]) == x) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }

    //Q2
    static void tripleSum(int[] arr, int y) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = i + 2; k < n; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == y) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    //Q3
    static int findUnique(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    //Q4
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secondMax(int[] arr) {
        int mx = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return findMax(arr);
    }

    //Q5
    static int firstRepeatingNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    //6
    static int lastRepeatingNumber(int[] arr) {
        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    num = arr[i];
                }
            }
        }
        return num;
    }

    //7
    static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int secondSmallestNumber(int[] arr) {
        int mi = findMin(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mi) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        return findMin(arr);
    }

    public static void main(String[] args) {
        //Q1
        //Find the total number of pairs in the array whose sum is equal to the given value x.
        int[] a = {4, 6, 3, 5, 8, 2};
        int x = 7;
        pairSum(a, x);


        //Q2
        //Count the number of triplets whose sum is equal to the given value x.
        int[] b = {1, 4, 5, 6, 7};
        int y = 12;
        tripleSum(b, y);


        //Q3
        //Find the unique number in a given array where all the elements are repeated twice with one value being unique.
        int[] c = {21, 7, 3, 21, 5, 7, 3, 1, 5};
        System.out.println(findUnique(c));


        //Q4
        //Find the second-largest element in the given Array.
        int[] d = {9, 8, 9, 6, 9, 5, 8};
        int[] d1 = {0, -2, 0, -3, 0, -4};
        System.out.println(secondMax(d1));


        //Q5
        //Given an array 'a' consisting of integers.Return the first value that is repeating in this array.If
        // no value is being repeated,return -1.
        int[] e = {1, 2, 5, 3, 4, 6, 4, 3};
        System.out.println("First Repeating Number : " + firstRepeatingNumber(e));


        //Q6
        //Given an array 'a' consisting of integers.Return the last value that is repeating in this array.If
        // no value is being repeated,return -1.
        int[] f = {1, 2, 5, 3, 4, 6, 4, 3, 6};
        System.out.println("Last Repeating Number : " + lastRepeatingNumber(f));

        //Q7
        //Find the second-smallest number in the given array.
        int[] g = {1, 2, 6, 5, 9, 4};

        System.out.println(secondSmallestNumber(g));


    }
}
