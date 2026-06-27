import java.util.ArrayList;
public class kk68 {
    static void lsonmultipleoccurrences(int[] arr,int target, int index, ArrayList<Integer> ans){
        

        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            ans.add(index);
        }
        lsonmultipleoccurrences(arr,target,index+1,ans);
    }
    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
        int[] arr={2,4,6,4,8,4};
        int target=4;
        int index=0;
        lsonmultipleoccurrences(arr,target,index,ans);
        System.out.println(ans);
    }
    
}
