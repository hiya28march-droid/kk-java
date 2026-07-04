public class kk85 {
    static int mazeproblem(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
         return mazeproblem(r-1,c)+mazeproblem(r,c-1);
    }
    
    public static void main(String[] args) {
        System.out.println(mazeproblem(2,2));
    }
}
