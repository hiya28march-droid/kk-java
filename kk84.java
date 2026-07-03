import java.util.*;
public class kk84 {
    static ArrayList<Integer> dicethrow(String p,int target){
        ArrayList<Integer> ans=new ArrayList<>();
        if(target==0){
            ans.add(Integer.parseInt(p));
            return ans;
        }
        for(int i=1;i<=6 && i<=target;i++){
            ans.addAll(dicethrow(p+i,target-i));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(dicethrow("",4));
    }
    
}
