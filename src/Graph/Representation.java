package Graph;

import java.util.*;

public class Representation {
    public static void main(String[] args) {
        int n=3,m=3;

        //Matrix store
        int[][] adj =new int[n+1][n+1];

        //edge 1--2
        adj[1][2]=1;
        adj[2][1]=1;

        //edge 2--3
        adj[2][3]=1;
        adj[3][2]=1;

        //edge 1--3
        adj[1][3]=1;
        adj[3][1]=1;


        //List store
        ArrayList<ArrayList<Integer>> adj1=new ArrayList<ArrayList<Integer>>();

        //n+1
        for(int i=0;i<=n;i++){
            adj1.add(new ArrayList<Integer>());
        }

        //edge 1--2
        adj1.get(1).add(2);
        adj1.get(2).add(1);

        //edge 2--3
        adj1.get(2).add(3);
        adj1.get(3).add(2);

        //edge 1--4
        adj1.get(1).add(3);
        adj1.get(3).add(1);


        for(int i=0;i<n;i++){
            for(int j=0;i<adj1.get(1).size();j++){
                System.out.println(adj1.get(i).get(j));
            }
        }
    }
}
