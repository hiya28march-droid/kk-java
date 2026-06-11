import java.util.Scanner;

public class kk17 {
    //A person can votes if age is greater than or equal to 18
    static boolean isage(int age){
        if(age>=18){
            return true;

        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(isage(age)){
            System.out.println("person can vote");
        }
        else{
            System.out.println("person cannot vote");
        }
        
    }
    
}
