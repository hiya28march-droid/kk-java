public class kk55 {
    static int Nto1(int n){
        if(n==1){
            return 1;
        }
        System.out.println(n);
        return Nto1(n-1);
        }
    
    public static void main(String[] args) {
        int n=5;
        System.out.println(Nto1(n));
    }
    
}
