public class kk22 {
    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
           

            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={23,45,1,2,18,19,-3};
        int target=19;
        int ans=linearsearch(nums,target);
        System.out.println(ans);
        
    }
    
}
