public class kk60 {
    static int productofdigits(int n){
        if(n==0){
            return 1;
        }
        int rem=n%10;
        return rem*productofdigits(n/10);
    }
    public static void main(String[] args) {
        int n=1340;
        System.out.println(productofdigits(n));
    }
    
}
