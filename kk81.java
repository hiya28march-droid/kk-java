import java.util.*;
public class kk81 {
    static ArrayList<String> permutation(String p,String up){
        ArrayList<String> ans=new ArrayList<>();
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i);
            ans.addAll(permutation(first+ch+second,up.substring(1)));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(permutation("","abc"));
    }
    
}
