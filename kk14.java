import java.util.Scanner;
public class kk14 {
    static boolean isArm(int n){
        int sum=0;
        int temp=n;
        
        for(int i=1;i<=n;i++){
            
        int digit=temp%10;
        sum=sum+digit*digit*digit;
        temp=temp/10;
        }
        if(sum==n){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a three digit number:");
        int n=sc.nextInt();
        if(isArm(n)){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }


        
    }
    
}
