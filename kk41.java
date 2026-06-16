public class kk41 {
    static int fibonacci(int n){
    /*     int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return a;
    }*/
   if(n<2){
    return n;

   }
   return fibonacci(n-1)+fibonacci(n-2);
}
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    
}
