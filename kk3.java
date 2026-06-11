import java.util.Scanner;
public class kk3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int sum=0;
        while(true){
            System.out.println("enter a number or 0 to stop");
        int a=sc.nextInt();
        if(a==0){
            break;

        }
        sum=sum+a;
    }
    System.out.println("sum of number is :"+sum);
        
    }
    
}

