public class kk97 {
    private int num; //encapsulation
    String name;
    int[] arr;
    public int getnum(){ // getter method
        return num;
    }
    public kk97(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
    
    public static void main(String[] args) {
        kk97 obj=new kk97(4,"Hiya");
        System.out.println(obj.num);
        System.out.println(obj.name);
        System.out.println(obj.arr.length);

    }
    
}
