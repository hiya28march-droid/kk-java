public class kk44 {
    static int findunique(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,1,2,1,3,6,4};
        System.out.println(findunique(arr));
    }
    
}
