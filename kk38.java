public class kk38 {
    //recursion
    static void message(){
        System.out.println("Hello World");
        message1();
    }
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        //write a function that prints hello world
        message();
    }
    
}
//calling 1 function in another function is called recursion.
