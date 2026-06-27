public class kk66 {
    static boolean sortedarray(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<=arr[i+1] && sortedarray(arr,i+1);
       
       


    }
    public static void main(String[] args) {
        int[] arr={1,2,4,8,9,3};
        int i=0;
        System.out.println(sortedarray(arr,i));
    }
    
}
