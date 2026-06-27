public class kk63 {
    static boolean palindrome(int n){
        if(n==0){
            return true;
        }
        int rev=0;
        int temp=n;
        while(temp>0){
            int rem=temp%10;
            rev=rev*10 + rem;
            temp=temp/10;
        }
        return rev==n;
    }
    public static void main(String[] args) {
        int n=53235;
        System.out.println(palindrome(n));
    }
    
}
