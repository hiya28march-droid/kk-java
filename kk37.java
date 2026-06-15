public class kk37 {
    static boolean palindrome(String str){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                s.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder rev=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            rev.append(s.charAt(i));

        }
        return s.toString().equals(rev.toString());
    }
    public static void main(String[] args) {
        System.out.println(palindrome("A man, a plan, a canal: Panama")); 
        System.out.println(palindrome("race a car")); 
    }
    
}
