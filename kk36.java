
import java.util.Arrays;
public class kk36 {
    static void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
            
            }

        }

    
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
