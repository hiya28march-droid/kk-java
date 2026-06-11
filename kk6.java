import java.util.Scanner;
public class kk6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number");
        int a=sc.nextInt();
        System.out.println("enter ending number: ");
        int b=sc.nextInt();
        
        
        for(int num=a;num<=b;num++){
            int temp=num;
            int sum=0;

            while(temp>0){
                int i=temp%10;
                sum=sum+ i*i*i;
                temp=temp/10;
            }
        
        if(sum==num){
            System.out.println(num);
            
        }
    }
        

        
    }
    
}
