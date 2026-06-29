import java.util.*;
public class kk73 {
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid,arr.length);
        left=mergesort(left);
        right=mergesort(right);
        return merge(left,right);



    }
    static int[] merge(int[] left,int[] right){
        int[] result=new int[left.length+right.length];
         int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // leftover left
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // leftover right
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }


    
    public static void main(String[] args) {
        int[] arr={8,3,4,12,5,6};
        int[] sorted=mergesort(arr);
        System.out.println(Arrays.toString(sorted));
    }
    
}
