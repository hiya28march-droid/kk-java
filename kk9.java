import java.util.Scanner;
public class kk9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in which occurences is to be counted: ");
        long num=sc.nextLong();
        System.out.println("enter the number to be counted in the num");
        int n=sc.nextInt();
        int count=0;
        while(num>0){
            
            long digit=num%10;
            
            if(digit==n){
                count++;
            }
            num=num/10;
        }
            System.out.println("counting occurences: "+ count);
        

        
    }
    
}
