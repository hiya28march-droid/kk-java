public class kk23 {
    static boolean linearsearch(String s, char target){
        
        if(s.length()==0){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==target){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        String s="Kunal";
        char target='u';
        System.out.println(linearsearch(s,target));
        
    }
    
}
