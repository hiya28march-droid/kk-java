public class kk87 {
    static void mazepathdiagonal(String p,int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r>1 && c>1 )mazepathdiagonal(p+'D',r-1,c-1);
        if(r>1)mazepathdiagonal(p+'V',r-1,c);
        if(c>1)mazepathdiagonal(p+'H',r,c-1);
    }
    public static void main(String[] args) {
        mazepathdiagonal("",3,3);
    }
    
}
