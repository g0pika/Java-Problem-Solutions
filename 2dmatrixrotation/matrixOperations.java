public class matrixOperations {
    public static void rotateMatrix(int[][] mat)
    {
        transpose(mat);
        reverseRows(mat);
    }
   
    static void transpose(int mat[][])
    {
        for (int i = 0; i < mat.length; i++)
            for (int j = i; j < mat[0].length; j++)
            {
                int x = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = x;
            }
    }
     static void reverseRows(int mat[][])
    {
        for (int i = 0; i < mat.length; i++)
            reverse(mat[i]);
    }
    static void reverse(int arr[])
    {
        int i = 0, j = arr.length - 1;
        while (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
