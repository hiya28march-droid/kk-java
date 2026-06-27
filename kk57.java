public class kk57 {
    static void printNto1and1toN(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printNto1and1toN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=5;
        printNto1and1toN(n);
    }
    
}
