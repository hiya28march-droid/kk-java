import java.util.Scanner;
public class kk12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a fruit: ");
        String fruit=sc.next();
        switch (fruit){
            case "Mango":
                {
                    System.out.println("sweet");
                }
                break;
            case "apple":
                {
                    System.out.println("red");
                }
                break;
            case "Guava":
                {
                    System.out.println("green");
                }
                break;
            case "orange":
                {System.out.println("orange");}
                break;
            default:
                {
                    System.out.println("no fruit entered");
                }

        }
        
    }
    
}
