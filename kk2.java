import java.util.Scanner;
public class kk2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=a;
        int y=b;
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        int hcf=x;
        //hcf*lcm=a*b;
        int lcm=(a*b)/hcf;
        System.out.println("hcf of the two numbers is: "+ hcf);
        System.out.println("lcm of the two numbers is : "+ lcm);

        
    }
    
}
