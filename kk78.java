import java.util.*;
public class kk78 {
    static ArrayList<String> subsequence(String p,String up){
        ArrayList<String> ans=new ArrayList<>();

        if(up.isEmpty()){
            ans.add(p);
            return ans ;
        }
        char ch=up.charAt(0);
        ans.addAll(subsequence(p+ch,up.substring(1)));
        ans.addAll(subsequence(p,up.substring(1)));
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(subsequence(" ","abc"));

    }
    
}
