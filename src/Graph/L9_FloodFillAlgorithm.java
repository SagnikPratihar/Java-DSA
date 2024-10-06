package Graph;

public class L9_FloodFillAlgorithm {

        private void dfs(int row,int col,int[][] ans,int[][] image,int newColor,int[] delRow,int[] delCol,int intColor){
            ans[row][col]=newColor;
            int n=image.length;
            int m=image[0].length;
            for(int i=0;i<4;i++){
                int nrow=row+delRow[i];
                int ncol=col+delCol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==intColor && ans[nrow][ncol]!=newColor){
                    dfs(nrow,ncol,ans,image,newColor,delRow,delCol,intColor);
                }
            }
        }
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
        {
            // Code here
            int intColor=image[sr][sc];
            int[][] ans=image;
            int[] delRow={-1,0,+1,0};  //These arrays define the four directions: up (-1, 0), right (0, +1), down (+1, 0), and left (0, -1).
            int[] delCol={0,+1,0,-1};
            dfs(sr,sc,ans,image,newColor,delRow,delCol,intColor);
            return ans;
        }

}
