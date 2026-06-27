public class kk59 {
    static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem+sumofdigits(n/10);
    }
    public static void main(String[] args) {
        int n=1342;
        System.out.println(sumofdigits(n));
    }
    
}
