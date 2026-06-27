public class kk54 {
    static int hcf(int a,int b){
        int x=a;
        int y=b;
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;

           

        }

        return x;
    }
    static int lcm(int a,int b){
        return (a*b)/hcf(a,b);
    }
    public static void main(String[] args) {
        int a=5;
        int b=15;
        System.out.println(hcf(a,b));
        System.out.println(lcm(a,b));
    }
    
}
