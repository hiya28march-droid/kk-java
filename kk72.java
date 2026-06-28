public class kk72 {
    static int findminimum(int[] arr,int start,int end){
        
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[end]){
                start=mid+1;

            }
            if(arr[mid]<arr[end]){
                end=mid;
            }
        }
        return arr[start];

    }
    public static void main(String[] args) {
        
        int[] arr={4,5,6,7,1,2};
        int start=0;
        int end=arr.length-1;
        System.out.println(findminimum(arr,start,end));
    }
    
}
