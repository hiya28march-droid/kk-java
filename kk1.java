import java.util.Scanner;
public class kk1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ENTER A YEAR");
        int a=sc.nextInt();
        if(a%4==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }


    }
}