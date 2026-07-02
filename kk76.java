public class kk76 {
    static String skipstring(String s){
        if(s.isEmpty()){
            return "";

        }
        
        if(s.startsWith("apple")){
            return skipstring(s.substring(5));
        }
        return s.charAt(0)+skipstring(s.substring(1));
    }
    public static void main(String[] args) {
        String s="bcappledog";
       
        System.out.println(skipstring(s));
    }
    
}
