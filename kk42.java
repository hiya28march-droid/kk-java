public class kk42 {
    static int binarysearch(int[] arr, int target,int s,int e){
        
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        else if(target<arr[m]){
            return binarysearch(arr,target,s,m-1);
        }
        else{
            return binarysearch(arr,target,m+1,e);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=5;
        System.out.println(binarysearch(arr,target,0,arr.length-1));

    }
    
}
