public class kk64 {
    static int countzeroes(int n){
        if(n==0){
            return 0;
        }
        
        int count=0;
        if(n%10==0){
            count++;
        }
        return count+ countzeroes(n/10);
    }
    public static void main(String[] args) {
        int n=0;
        if(n==0){
            System.out.println(1);;
        }
        else{
        System.out.println(countzeroes(n));
        }

    }
    
}
