public class kk40 {
    static void print(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    public static void main(String[] args) {
        print(1);
    }
    
}
//recursion is a function that calls itself.

