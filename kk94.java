public class kk94 {
    int age;
    String name;
    int salary;
    boolean married;
    public kk94(int age, String name, int salary, boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
    }
    public static void main(String[] args) {
        kk94 obj1=new kk94(19,"hiya",10000,false);
        kk94 obj2=new kk94(15,"kash",20000,true);
        System.out.println(obj1.age);
        System.out.println(obj2.name);
    }
    
}
