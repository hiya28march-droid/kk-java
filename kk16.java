import java.util.Scanner;
public class kk16 {
    static boolean iseven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(iseven(n)){
            System.out.println("Even number");

    }
    else{
        System.out.println("odd number");
    }
    
}
}

