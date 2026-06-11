import java.util.Scanner;
public class kk15 {
    //Java program to find the Largest and Smallest of three Integers
    static int max(int a,int b,int c){
        int max=a;
        if(a>b && a>c){
            max=a;
        }
        else if(b>a && b>c){
            max=b;

        }
        else if(c>a && c>b){
            max=c;
        }
        else{
            System.out.println("all equal");
        }
        return max;
    }
    static int min(int a,int b,int c){
        int min=a;
        if(a<b && a<c){
            min =a;

        }
        else if(b<a && b<c){
            min=b;
        }
        else if(c<a && c<b){
            min=c;
        }
        else{
            System.out.println("all equal");
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(max(a,b,c));
        System.out.println(min(a,b,c));
        
    }
    
    
}
