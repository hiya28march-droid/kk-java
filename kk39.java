public class kk39 {
    static void printnumber(int n){
        System.out.println(n);
        printnumber1(2);


    }
    static void printnumber1(int n){
        System.out.println(n);
        printnumber2(3);


    }
    static void printnumber2(int n){
        System.out.println(n);
        printnumber3(4);


    }
    static void printnumber3(int n){
        System.out.println(n);
        printnumber4(5);

    }
    static void printnumber4(int n){
        System.out.println(n);


    }
    
    public static void main(String[] args) {
        //write a function that takes in number and prints it.
        //print first five numbers 12345
        printnumber(1);
        
    }
    
}
