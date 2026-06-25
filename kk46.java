public class kk46 {
    static int magicnumber(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int lastdigit=n&1;
            n=n>>1;
            ans=ans+lastdigit*base;
            base=base*5;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(magicnumber(n));
    }
}
