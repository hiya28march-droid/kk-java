

public class kk83 {
    static int phonepadcount(String p,String up){
        
        if(up.isEmpty()){
            return 1;
        }
        int digit=up.charAt(0)-'0'; //this will convert '2' to 2.
        int count=0;
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i); // this will convert 0 to 'a' and 1 to 'b' and so on.

            count+=phonepadcount(p+ch,up.substring(1));

        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(phonepadcount("","12"));
    }
    
}
