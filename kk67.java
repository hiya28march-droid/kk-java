public class kk67 {
    static int linearsearchusingrecursion(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearsearchusingrecursion(arr,target,index+1);
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        int target=4;
        int index=0;
        System.out.println(linearsearchusingrecursion(arr,target,index));
    }
    
}
