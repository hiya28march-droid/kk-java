import java.util.Scanner;
public class kk19 {
    /*
    Here is a Java Program to find the grade of a student, given the marks of N subjects. Given the marks of N subjects, we have to print the grade of a student based on the following grade slab.

If Percentage Marks > 90, Grade is A+
If 70 <= Percentage Marks <= 89, Grade is A
If 60 <= Percentage Marks <= 69, Grade is B
If 50 <= Percentage Marks <= 59, Grade is C
If Percentage Marks <= 40, Grade is D

 */
static String grade(float percentage){
    if(percentage>90){
        return "A+";
    }
    else if(percentage>=70 && percentage<=89){
        return "A";
    }
    else if(percentage>=60 && percentage<=69){
        return "B";
    }
    else if(percentage>=50 && percentage<=59){
        return "C";
    }
    else if(percentage<=40){
        return "D";
    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter how many subjects: ");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
        System.out.println("Enter the marks of subject"+ i+ ":");
        int marks=sc.nextInt();
        sum=sum+marks;
        
        
    }
    float percentage=sum/n;
    System.out.println("percentage="+ percentage);
    System.out.println("final grade="+ grade(percentage));

}
    
}
