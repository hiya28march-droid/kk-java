import java.util.*;
public class kk86 {
    static ArrayList<String> mazepath(String p,int r, int c){
        ArrayList<String> ans=new ArrayList<>();
        if(r==1 && c==1){
            ans.add(p);
            return ans;
        }
        if(r>1) ans.addAll(mazepath(p+'D',r-1,c));
        if(c>1) ans.addAll(mazepath(p+'R',r,c-1));
        return ans;
    }
    public static void main(String[] args) {
       System.out.println(mazepath("",3,3));
    }
    
}
