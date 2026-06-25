public class kk47 {
    static int noofdigits(int n,int b){
        
            return (int)(Math.log(n)/Math.log(b)) +1;
            
    }
    public static void main(String[] args) {
        int n=10;
        int b=2;
        System.out.println(noofdigits(n,b));
    }
    
}
