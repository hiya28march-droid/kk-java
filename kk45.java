public class kk45 {
    static int findithbit(int n,int i){
        if((n&(1<<i))!=0){
            return 1;
        }

        else{
            return 0;
        }
    }
    
    public static void main(String[] args) {
        int n=45;
        int i=3;
        System.out.println(findithbit(n,i));
    }
    
}
