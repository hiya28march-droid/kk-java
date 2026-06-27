public class kk52 {
    static double newtonraphson(double n){
        double x=n;
        double root;
        while(true){
            root=0.5*(x+n/x);
            if(Math.abs(root-x)<1e-6){
                break;
            }
            x=root;
        }
        return root;
    }
    public static void main(String[] args) {
        double n=40;
        System.out.println(newtonraphson(n));
    }
    
}
