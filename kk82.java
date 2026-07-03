import java.util.*;

public class kk82 {
    static ArrayList<String> phonepad(String p,String up){
        ArrayList<String> ans=new ArrayList<>();
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
        int digit=up.charAt(0)-'0'; //this will convert '2' to 2.
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i); // this will convert 0 to 'a' and 1 to 'b' and so on.
            
            ans.addAll(phonepad(p+ch,up.substring(1)));
            


        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(phonepad("","12"));
    }
    
}
