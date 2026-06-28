import java.util.ArrayList;
public class kk69{
    static void returnarraylistm1(int[] arr, int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        returnarraylistm1(arr,target,index+1,list);
    }

    public static void main(String[] args) { 
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr={1,2,3,4,4,8};
        int target=4;
        int index=0;
        returnarraylistm1(arr,target,index,list);
        System.out.println(list);
        
    }
}