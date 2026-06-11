import java.util.Scanner;
public class kk5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String a=sc.next();
        String rev="";
        for(int i=a.length()-1 ; i>=0; i--){
            rev=rev+a.charAt(i);
        }


        
        if(a.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    
        
    
}
}
