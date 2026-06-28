import java.util.ArrayList;
public class kk70 {
    static ArrayList<Integer> returnarraylist(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelow=returnarraylist(arr,target,index+1);
        list.addAll(ansfrombelow);
        return list;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,8};
        int target=4;
        int index=0;
        System.out.println(returnarraylist(arr,target,index));
    }
    
}
