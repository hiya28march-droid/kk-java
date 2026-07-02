public class kk75 {
    static String skipacharacter(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        if(ch=='a'){
            return skipacharacter(s.substring(1));
        }
        return ch+skipacharacter(s.substring(1));

    }
    public static void main(String[] args) {
        String s="baccad";
        System.out.println(skipacharacter(s));
        
    }
    
}
