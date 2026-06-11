import java.util.Arrays;
public class kk33 {
    //row column matrix binary search
    static int[] search(int[][] matrix, int target){
        int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
                if(matrix[i][j]==target){
                    return new int[]{i,j};
                }
                else if(target<matrix[i][j]){
                    j--;
                }
                else{
                    i++;
                }
            }

            
            return new int[]{-1,-1};
        }


    
    public static void main(String[] args) {
        int[][] matrix={
             {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}

        };
        int target=29;
        int[] ans=search(matrix,target);
        System.out.println(Arrays.toString(ans));
        
    }
    
}
