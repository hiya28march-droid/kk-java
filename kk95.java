public class kk95 {
    double l;
    double h;
    double w;

    kk95(){
        this.l=-1;
        this.h=-1;
        this.w=-1;

    }
    kk95(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }
    kk95(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    kk95(kk95 old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }
static class kk95weight extends kk95{
    double weight;
    public kk95weight(double l,double h,double w,double weight){
        super(l,h,w);
        this.weight=weight;
    }


}
    
    public static void main(String[] args) {
       // kk95 kk95=new kk95(4);
        kk95weight box3=new kk95weight(4,4,4,4);
        // System.out.println(kk95.l + " "+ kk95.h+ " "+ kk95.w);
        System.out.println(box3.h +" "+box3.weight);
        //it will not be able to access the ones that are private in the parent class
    }

    
}

