public class boundary {
    public static void printBoundary(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for(int j = 0; j < n; j++){
            System.out.print(mat[0][j] + " ");
        }
        for(int i = 1; i < m; i++){
            System.out.print(mat[i][n-1] + " ");
        }
        for(int j = n-2; j >=0; j--){
            System.out.print(mat[m-1][j] + " ");
        }
        for(int i = m-2; i>0; i--){
            System.out.print(mat[i][0] + " ");
        }

    }
}
