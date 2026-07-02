public class kk77 {
    static String skipstringnotreqd(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipstringnotreqd(s.substring(3));
        }
        return s.charAt(0)+skipstringnotreqd(s.substring(1));
    }
    public static void main(String[] args) {
        String s="bcappleapp";
        System.out.println(skipstringnotreqd(s));
    }
    
}
