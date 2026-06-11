import java.util.Scanner;
public class kk18 {
    static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    // Addition of two numbers in Java using method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum(a,b));

        
    }

    
}
