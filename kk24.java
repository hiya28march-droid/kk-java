public class kk24 {
    static boolean linearsearch(int[] arr, int target){
    if(arr.length==0){
        return false;

    }
    for(int i=1;i<=4;i++){
        if(arr[i]==target){
            return true;
        }
    }
    return false;
    }
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        int target=3;
        System.out.println(linearsearch(arr,target));

    }
    
}
