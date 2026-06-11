import java.util.Scanner;
public class kk8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("lower case");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("upper case");
        }
        else{
            System.out.println("number or any other character");
        }
        
        
    }
    
}
