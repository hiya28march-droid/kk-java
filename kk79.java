public class kk79 {
    static void asciivaluesubsequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        asciivaluesubsequence(p+ch,up.substring(1));
        asciivaluesubsequence(p,up.substring(1));
        asciivaluesubsequence(p+(int)ch,up.substring(1));
    }
    public static void main(String[] args) {
        asciivaluesubsequence(" ","ab");
    }
    
}
