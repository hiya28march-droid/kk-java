import java.util.Arrays;
//max in 2d array
public class kk27 {
    static int max(int[][] arr){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for ( int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                
            }
            
        }
        return max;

        
    }
    public static void main(String[] args) {
        int[][] arr= {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        System.out.println(max(arr));
        
    }
    
}
